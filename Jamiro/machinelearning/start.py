from scikitlearn import machinelearning

sentence = "Quick question, is this pronounciation correct?"
result = machinelearning().gettype(sentence)
print("The result is: {}".format(result))
