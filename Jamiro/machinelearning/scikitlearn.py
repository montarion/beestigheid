from sklearn import tree
import pydotplus
from six import StringIO
class machinelearning:
    def __init__(self):
        self.questionlist = ["who", "what", "where", "why", "when", "how"]
        self.commandlist = ["time", "weather", "lights"]

        features = [[1,1,1],[1,1,0],[1,0,1],[1,0,0],[0,0,0],[0,0,1],[0,1,0],[0,1,1]]
        self.labels = ["command/question","question","command","question","unknown","command","question","command/question"]
        self.fnames = ["has question mark", "starts with 5h", "contains command"]
        clf = tree.DecisionTreeClassifier()
        self.clf = clf.fit(features, self.labels)

    def predict(self, scorelist):
        result = self.clf.predict([scorelist])
        return result

    def getscores(self, sentence):
        scorelist = [0,0,0]
        if sentence[-1] == "?":
            scorelist[0] = 1
        if sentence.split(" ")[0] in self.questionlist:
            scorelist[1] = 1
        if sentence.split(" ")[0] in self.commandlist:
            scorelist[2] = 1
        return(scorelist)


    def gettype(self, sentence):
        scorelist = self.getscores(sentence)
        self.visualise()
        return self.predict(scorelist)[0]

    def visualise(self):
        dot_data = StringIO()
        tree.export_graphviz(self.clf, out_file=dot_data, feature_names=self.fnames)
        graph = pydotplus.graph_from_dot_data(dot_data.getvalue())
        graph.write_pdf("ml.pdf")
