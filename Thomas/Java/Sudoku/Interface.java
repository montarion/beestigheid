package Sudoku;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Interface extends Application{
		int minimum = 0;
		int last = 0;
		int dokulast = 0;
		int timesbacked = 0;
		int goback = 1;
		boolean NotSolved = true;
		boolean invoer = true;
		StringBuilder sb = new StringBuilder();
		int[][] DokuSolve = new int[9][9];
		int[][] DokuCopy = new int[9][9];
		long start;
		long elapsedTimeMillis;
		float elapsedTimeSec;
		int elapsedTimeMinutes;
		Label timelabel = new Label();
		Button Brutedoku = new Button("BruteDoku");
		
		TextArea D1 = new TextArea();
		TextArea D2 = new TextArea();
		TextArea D3 = new TextArea();
		TextArea D4 = new TextArea();
		TextArea D5 = new TextArea();
		TextArea D6 = new TextArea();
		TextArea D7 = new TextArea();
		TextArea D8 = new TextArea();
		TextArea D9 = new TextArea();
		TextArea D10 = new TextArea();
		TextArea D11 = new TextArea();
		TextArea D12 = new TextArea();
		TextArea D13 = new TextArea();
		TextArea D14 = new TextArea();
		TextArea D15 = new TextArea();
		TextArea D16 = new TextArea();
		TextArea D17 = new TextArea();
		TextArea D18 = new TextArea();
		TextArea D19 = new TextArea();
		TextArea D20 = new TextArea();
		TextArea D21 = new TextArea();
		TextArea D22 = new TextArea();
		TextArea D23 = new TextArea();
		TextArea D24 = new TextArea();
		TextArea D25 = new TextArea();
		TextArea D26 = new TextArea();
		TextArea D27 = new TextArea();
		TextArea D28 = new TextArea();
		TextArea D29 = new TextArea();
		TextArea D30 = new TextArea();
		TextArea D31 = new TextArea();
		TextArea D32 = new TextArea();
		TextArea D33 = new TextArea();
		TextArea D34 = new TextArea();
		TextArea D35 = new TextArea();
		TextArea D36 = new TextArea();
		TextArea D37 = new TextArea();
		TextArea D38 = new TextArea();
		TextArea D39 = new TextArea();
		TextArea D40 = new TextArea();
		TextArea D41 = new TextArea();
		TextArea D42 = new TextArea();
		TextArea D43 = new TextArea();
		TextArea D44 = new TextArea();
		TextArea D45 = new TextArea();
		TextArea D46 = new TextArea();
		TextArea D47 = new TextArea();
		TextArea D48 = new TextArea();
		TextArea D49 = new TextArea();
		TextArea D50 = new TextArea();
		TextArea D51 = new TextArea();
		TextArea D52 = new TextArea();
		TextArea D53 = new TextArea();
		TextArea D54 = new TextArea();
		TextArea D55 = new TextArea();
		TextArea D56 = new TextArea();
		TextArea D57 = new TextArea();
		TextArea D58 = new TextArea();
		TextArea D59 = new TextArea();
		TextArea D60 = new TextArea();
		TextArea D61 = new TextArea();
		TextArea D62 = new TextArea();
		TextArea D63 = new TextArea();
		TextArea D64 = new TextArea();
		TextArea D65 = new TextArea();
		TextArea D66 = new TextArea();
		TextArea D67 = new TextArea();
		TextArea D68 = new TextArea();
		TextArea D69 = new TextArea();
		TextArea D70 = new TextArea();
		TextArea D71 = new TextArea();
		TextArea D72 = new TextArea();
		TextArea D73 = new TextArea();
		TextArea D74 = new TextArea();
		TextArea D75 = new TextArea();
		TextArea D76 = new TextArea();
		TextArea D77 = new TextArea();
		TextArea D78 = new TextArea();
		TextArea D79 = new TextArea();
		TextArea D80 = new TextArea();
		TextArea D81 = new TextArea();
		
		public void start(Stage getDoku) throws Exception{
		D1.setMaxWidth(70);
		D1.setMaxHeight(70);
		D1.setMinWidth(70);
		D1.setMinHeight(70);
		D1.setStyle("-fx-control-inner-background: #e0e0e0; -fx-background-color:black;-fx-text-inner-color: black;");
		D1.setFont(Font.font("Verdana", FontWeight.BOLD, 35));
		D2.setMaxWidth(70);
		D2.setMaxHeight(70);
		D2.setMinWidth(70);
		D2.setMinHeight(70);
		D2.setStyle("-fx-control-inner-background: #e0e0e0; -fx-background-color:black;-fx-text-inner-color: black;");
		D2.setFont(Font.font("Verdana", FontWeight.BOLD, 35));
		D3.setMaxWidth(70);
		D3.setMaxHeight(70);
		D3.setMinWidth(70);
		D3.setMinHeight(70);
		D3.setStyle("-fx-control-inner-background: #e0e0e0; -fx-background-color:black;-fx-text-inner-color: black;");
		D3.setFont(Font.font("Verdana", FontWeight.BOLD, 35));
		D4.setMaxWidth(70);
		D4.setMaxHeight(70);
		D4.setMinWidth(70);
		D4.setMinHeight(70);
		D4.setStyle("-fx-control-inner-background: #efefef; -fx-background-color:black;-fx-text-inner-color: black;-fx-border-color: black;-fx-border-width: 1 0 0 0px;");
		D4.setFont(Font.font("Verdana", FontWeight.BOLD, 35));
		D5.setMaxWidth(70);
		D5.setMaxHeight(70);
		D5.setMinWidth(70);
		D5.setMinHeight(70);
		D5.setStyle("-fx-control-inner-background: #efefef; -fx-background-color:black;-fx-text-inner-color: black;");
		D5.setFont(Font.font("Verdana", FontWeight.BOLD, 35));
		D6.setMaxWidth(70);
		D6.setMaxHeight(70);
		D6.setMinWidth(70);
		D6.setMinHeight(70);
		D6.setStyle("-fx-control-inner-background: #efefef; -fx-background-color:black;-fx-text-inner-color: black;");
		D6.setFont(Font.font("Verdana", FontWeight.BOLD, 35));
		D7.setMaxWidth(70);
		D7.setMaxHeight(70);
		D7.setMinWidth(70);
		D7.setMinHeight(70);
		D7.setStyle("-fx-control-inner-background: #e0e0e0; -fx-background-color:black;-fx-text-inner-color: black;-fx-border-color: black;-fx-border-width: 1 0 0 0px;");
		D7.setFont(Font.font("Verdana", FontWeight.BOLD, 35));
		D8.setMaxWidth(70);
		D8.setMaxHeight(70);
		D8.setMinWidth(70);
		D8.setMinHeight(70);
		D8.setStyle("-fx-control-inner-background: #e0e0e0; -fx-background-color:black;-fx-text-inner-color: black;");
		D8.setFont(Font.font("Verdana", FontWeight.BOLD, 35));
		D9.setMaxWidth(70);
		D9.setMaxHeight(70);
		D9.setMinWidth(70);
		D9.setMinHeight(70);
		D9.setStyle("-fx-control-inner-background: #e0e0e0; -fx-background-color:black;-fx-text-inner-color: black;");
		D9.setFont(Font.font("Verdana", FontWeight.BOLD, 35));
		D10.setMaxWidth(70);
		D10.setMaxHeight(70);
		D10.setMinWidth(70);
		D10.setMinHeight(70);
		D10.setStyle("-fx-control-inner-background: #e0e0e0; -fx-background-color:black;-fx-text-inner-color: black;");
		D10.setFont(Font.font("Verdana", FontWeight.BOLD, 35));
		D11.setMaxWidth(70);
		D11.setMaxHeight(70);
		D11.setMinWidth(70);
		D11.setMinHeight(70);
		D11.setStyle("-fx-control-inner-background: #e0e0e0; -fx-background-color:black;-fx-text-inner-color: black;");
		D11.setFont(Font.font("Verdana", FontWeight.BOLD, 35));
		D12.setMaxWidth(70);
		D12.setMaxHeight(70);
		D12.setMinWidth(70);
		D12.setMinHeight(70);
		D12.setStyle("-fx-control-inner-background: #e0e0e0; -fx-background-color:black;-fx-text-inner-color: black;");
		D12.setFont(Font.font("Verdana", FontWeight.BOLD, 35));
		D13.setMaxWidth(70);
		D13.setMaxHeight(70);
		D13.setMinWidth(70);
		D13.setMinHeight(70);
		D13.setStyle("-fx-control-inner-background: #efefef; -fx-background-color:black;-fx-text-inner-color: black;-fx-border-color: black;-fx-border-width: 1 0 0 0px;");
		D13.setFont(Font.font("Verdana", FontWeight.BOLD, 35));
		D14.setMaxWidth(70);
		D14.setMaxHeight(70);
		D14.setMinWidth(70);
		D14.setMinHeight(70);
		D14.setStyle("-fx-control-inner-background: #efefef; -fx-background-color:black;-fx-text-inner-color: black;");
		D14.setFont(Font.font("Verdana", FontWeight.BOLD, 35));
		D15.setMaxWidth(70);
		D15.setMaxHeight(70);
		D15.setMinWidth(70);
		D15.setMinHeight(70);
		D15.setStyle("-fx-control-inner-background: #efefef; -fx-background-color:black;-fx-text-inner-color: black;");
		D15.setFont(Font.font("Verdana", FontWeight.BOLD, 35));
		D16.setMaxWidth(70);
		D16.setMaxHeight(70);
		D16.setMinWidth(70);
		D16.setMinHeight(70);
		D16.setStyle("-fx-control-inner-background: #e0e0e0; -fx-background-color:black;-fx-text-inner-color: black;-fx-border-color: black;-fx-border-width: 1 0 0 0px;");
		D16.setFont(Font.font("Verdana", FontWeight.BOLD, 35));
		D17.setMaxWidth(70);
		D17.setMaxHeight(70);
		D17.setMinWidth(70);
		D17.setMinHeight(70);
		D17.setStyle("-fx-control-inner-background: #e0e0e0; -fx-background-color:black;-fx-text-inner-color: black;");
		D17.setFont(Font.font("Verdana", FontWeight.BOLD, 35));
		D18.setMaxWidth(70);
		D18.setMaxHeight(70);
		D18.setMinWidth(70);
		D18.setMinHeight(70);
		D18.setStyle("-fx-control-inner-background: #e0e0e0; -fx-background-color:black;-fx-text-inner-color: black;");
		D18.setFont(Font.font("Verdana", FontWeight.BOLD, 35));
		D19.setMaxWidth(70);
		D19.setMaxHeight(70);
		D19.setMinWidth(70);
		D19.setMinHeight(70);
		D19.setStyle("-fx-control-inner-background: #e0e0e0; -fx-background-color:black;-fx-text-inner-color: black;");
		D19.setFont(Font.font("Verdana", FontWeight.BOLD, 35));
		D20.setMaxWidth(70);
		D20.setMaxHeight(70);
		D20.setMinWidth(70);
		D20.setMinHeight(70);
		D20.setStyle("-fx-control-inner-background: #e0e0e0; -fx-background-color:black;-fx-text-inner-color: black;");
		D20.setFont(Font.font("Verdana", FontWeight.BOLD, 35));
		D21.setMaxWidth(70);
		D21.setMaxHeight(70);
		D21.setMinWidth(70);
		D21.setMinHeight(70);
		D21.setStyle("-fx-control-inner-background: #e0e0e0; -fx-background-color:black;-fx-text-inner-color: black;");
		D21.setFont(Font.font("Verdana", FontWeight.BOLD, 35));
		D22.setMaxWidth(70);
		D22.setMaxHeight(70);
		D22.setMinWidth(70);
		D22.setMinHeight(70);
		D22.setStyle("-fx-control-inner-background: #efefef; -fx-background-color:black;-fx-text-inner-color: black;-fx-border-color: black;-fx-border-width: 1 0 0 0px;");
		D22.setFont(Font.font("Verdana", FontWeight.BOLD, 35));
		D23.setMaxWidth(70);
		D23.setMaxHeight(70);
		D23.setMinWidth(70);
		D23.setMinHeight(70);
		D23.setStyle("-fx-control-inner-background: #efefef; -fx-background-color:black;-fx-text-inner-color: black;");
		D23.setFont(Font.font("Verdana", FontWeight.BOLD, 35));
		D24.setMaxWidth(70);
		D24.setMaxHeight(70);
		D24.setMinWidth(70);
		D24.setMinHeight(70);
		D24.setStyle("-fx-control-inner-background: #efefef; -fx-background-color:black;-fx-text-inner-color: black;");
		D24.setFont(Font.font("Verdana", FontWeight.BOLD, 35));
		D25.setMaxWidth(70);
		D25.setMaxHeight(70);
		D25.setMinWidth(70);
		D25.setMinHeight(70);
		D25.setStyle("-fx-control-inner-background: #e0e0e0; -fx-background-color:black;-fx-text-inner-color: black;-fx-border-color: black;-fx-border-width: 1 0 0 0px;");
		D25.setFont(Font.font("Verdana", FontWeight.BOLD, 35));
		D26.setMaxWidth(70);
		D26.setMaxHeight(70);
		D26.setMinWidth(70);
		D26.setMinHeight(70);
		D26.setStyle("-fx-control-inner-background: #e0e0e0; -fx-background-color:black;-fx-text-inner-color: black;");
		D26.setFont(Font.font("Verdana", FontWeight.BOLD, 35));
		D27.setMaxWidth(70);
		D27.setMaxHeight(70);
		D27.setMinWidth(70);
		D27.setMinHeight(70);
		D27.setStyle("-fx-control-inner-background: #e0e0e0; -fx-background-color:black;-fx-text-inner-color: black;");
		D27.setFont(Font.font("Verdana", FontWeight.BOLD, 35));
		D28.setMaxWidth(70);
		D28.setMaxHeight(70);
		D28.setMinWidth(70);
		D28.setMinHeight(70);
		D28.setStyle("-fx-control-inner-background: #efefef; -fx-background-color:black;-fx-text-inner-color: black;-fx-border-color: black;-fx-border-width: 0 0 0 1px;");
		D28.setFont(Font.font("Verdana", FontWeight.BOLD, 35));
		D29.setMaxWidth(70);
		D29.setMaxHeight(70);
		D29.setMinWidth(70);
		D29.setMinHeight(70);
		D29.setStyle("-fx-control-inner-background: #efefef; -fx-background-color:black;-fx-text-inner-color: black;-fx-border-color: black;-fx-border-width: 0 0 0 1px;");
		D29.setFont(Font.font("Verdana", FontWeight.BOLD, 35));
		D30.setMaxWidth(70);
		D30.setMaxHeight(70);
		D30.setMinWidth(70);
		D30.setMinHeight(70);
		D30.setStyle("-fx-control-inner-background: #efefef; -fx-background-color:black;-fx-text-inner-color: black;-fx-border-color: black;-fx-border-width: 0 0 0 1px;");
		D30.setFont(Font.font("Verdana", FontWeight.BOLD, 35));
		D31.setMaxWidth(70);
		D31.setMaxHeight(70);
		D31.setMinWidth(70);
		D31.setMinHeight(70);
		D31.setStyle("-fx-control-inner-background: #e0e0e0; -fx-background-color:black;-fx-text-inner-color: black;-fx-border-color: black;-fx-border-width: 1 0 0 1px;");
		D31.setFont(Font.font("Verdana", FontWeight.BOLD, 35));
		D32.setMaxWidth(70);
		D32.setMaxHeight(70);
		D32.setMinWidth(70);
		D32.setMinHeight(70);
		D32.setStyle("-fx-control-inner-background: #e0e0e0; -fx-background-color:black;-fx-text-inner-color: black;-fx-border-color: black;-fx-border-width: 0 0 0 1px;");
		D32.setFont(Font.font("Verdana", FontWeight.BOLD, 35));
		D33.setMaxWidth(70);
		D33.setMaxHeight(70);
		D33.setMinWidth(70);
		D33.setMinHeight(70);
		D33.setStyle("-fx-control-inner-background: #e0e0e0; -fx-background-color:black;-fx-text-inner-color: black;-fx-border-color: black;-fx-border-width: 0 0 0 1px;");
		D33.setFont(Font.font("Verdana", FontWeight.BOLD, 35));
		D34.setMaxWidth(70);
		D34.setMaxHeight(70);
		D34.setMinWidth(70);
		D34.setMinHeight(70);
		D34.setStyle("-fx-control-inner-background: #efefef; -fx-background-color:black;-fx-text-inner-color: black;-fx-border-color: black;-fx-border-width: 1 0 0 1px;");
		D34.setFont(Font.font("Verdana", FontWeight.BOLD, 35));
		D35.setMaxWidth(70);
		D35.setMaxHeight(70);
		D35.setMinWidth(70);
		D35.setMinHeight(70);
		D35.setStyle("-fx-control-inner-background: #efefef; -fx-background-color:black;-fx-text-inner-color: black;-fx-border-color: black;-fx-border-width: 0 0 0 1px;");
		D35.setFont(Font.font("Verdana", FontWeight.BOLD, 35));
		D36.setMaxWidth(70);
		D36.setMaxHeight(70);
		D36.setMinWidth(70);
		D36.setMinHeight(70);
		D36.setStyle("-fx-control-inner-background: #efefef; -fx-background-color:black;-fx-text-inner-color: black;-fx-border-color: black;-fx-border-width: 0 0 0 1px;");
		D36.setFont(Font.font("Verdana", FontWeight.BOLD, 35));
		D37.setMaxWidth(70);
		D37.setMaxHeight(70);
		D37.setMinWidth(70);
		D37.setMinHeight(70);
		D37.setStyle("-fx-control-inner-background: #efefef; -fx-background-color:black;-fx-text-inner-color: black;");
		D37.setFont(Font.font("Verdana", FontWeight.BOLD, 35));
		D38.setMaxWidth(70);
		D38.setMaxHeight(70);
		D38.setMinWidth(70);
		D38.setMinHeight(70);
		D38.setStyle("-fx-control-inner-background: #efefef; -fx-background-color:black;-fx-text-inner-color: black;");
		D38.setFont(Font.font("Verdana", FontWeight.BOLD, 35));
		D39.setMaxWidth(70);
		D39.setMaxHeight(70);
		D39.setMinWidth(70);
		D39.setMinHeight(70);
		D39.setStyle("-fx-control-inner-background: #efefef; -fx-background-color:black;-fx-text-inner-color: black;");
		D39.setFont(Font.font("Verdana", FontWeight.BOLD, 35));
		D40.setMaxWidth(70);
		D40.setMaxHeight(70);
		D40.setMinWidth(70);
		D40.setMinHeight(70);
		D40.setStyle("-fx-control-inner-background: #e0e0e0; -fx-background-color:black;-fx-text-inner-color: black;-fx-border-color: black;-fx-border-width: 1 0 0 0px;");
		D40.setFont(Font.font("Verdana", FontWeight.BOLD, 35));
		D41.setMaxWidth(70);
		D41.setMaxHeight(70);
		D41.setMinWidth(70);
		D41.setMinHeight(70);
		D41.setStyle("-fx-control-inner-background: #e0e0e0; -fx-background-color:black;-fx-text-inner-color: black;");
		D41.setFont(Font.font("Verdana", FontWeight.BOLD, 35));
		D42.setMaxWidth(70);
		D42.setMaxHeight(70);
		D42.setMinWidth(70);
		D42.setMinHeight(70);
		D42.setStyle("-fx-control-inner-background: #e0e0e0; -fx-background-color:black;-fx-text-inner-color: black;");
		D42.setFont(Font.font("Verdana", FontWeight.BOLD, 35));
		D43.setMaxWidth(70);
		D43.setMaxHeight(70);
		D43.setMinWidth(70);
		D43.setMinHeight(70);
		D43.setStyle("-fx-control-inner-background: #efefef; -fx-background-color:black;-fx-text-inner-color: black;-fx-border-color: black;-fx-border-width: 1 0 0 0px;");
		D43.setFont(Font.font("Verdana", FontWeight.BOLD, 35));
		D44.setMaxWidth(70);
		D44.setMaxHeight(70);
		D44.setMinWidth(70);
		D44.setMinHeight(70);
		D44.setStyle("-fx-control-inner-background: #efefef; -fx-background-color:black;-fx-text-inner-color: black;");
		D44.setFont(Font.font("Verdana", FontWeight.BOLD, 35));
		D45.setMaxWidth(70);
		D45.setMaxHeight(70);
		D45.setMinWidth(70);
		D45.setMinHeight(70);
		D45.setStyle("-fx-control-inner-background: #efefef; -fx-background-color:black;-fx-text-inner-color: black;");
		D45.setFont(Font.font("Verdana", FontWeight.BOLD, 35));
		D46.setMaxWidth(70);
		D46.setMaxHeight(70);
		D46.setMinWidth(70);
		D46.setMinHeight(70);
		D46.setStyle("-fx-control-inner-background: #efefef; -fx-background-color:black;-fx-text-inner-color: black;");
		D46.setFont(Font.font("Verdana", FontWeight.BOLD, 35));
		D47.setMaxWidth(70);
		D47.setMaxHeight(70);
		D47.setMinWidth(70);
		D47.setMinHeight(70);
		D47.setStyle("-fx-control-inner-background: #efefef; -fx-background-color:black;-fx-text-inner-color: black;");
		D47.setFont(Font.font("Verdana", FontWeight.BOLD, 35));
		D48.setMaxWidth(70);
		D48.setMaxHeight(70);
		D48.setMinWidth(70);
		D48.setMinHeight(70);
		D48.setStyle("-fx-control-inner-background: #efefef; -fx-background-color:black;-fx-text-inner-color: black;");
		D48.setFont(Font.font("Verdana", FontWeight.BOLD, 35));
		D49.setMaxWidth(70);
		D49.setMaxHeight(70);
		D49.setMinWidth(70);
		D49.setMinHeight(70);
		D49.setStyle("-fx-control-inner-background: #e0e0e0; -fx-background-color:black;-fx-text-inner-color: black;-fx-border-color: black;-fx-border-width: 1 0 0 0px;");
		D49.setFont(Font.font("Verdana", FontWeight.BOLD, 35));
		D50.setMaxWidth(70);
		D50.setMaxHeight(70);
		D50.setMinWidth(70);
		D50.setMinHeight(70);
		D50.setStyle("-fx-control-inner-background: #e0e0e0; -fx-background-color:black;-fx-text-inner-color: black;");
		D50.setFont(Font.font("Verdana", FontWeight.BOLD, 35));
		D51.setMaxWidth(70);
		D51.setMaxHeight(70);
		D51.setMinWidth(70);
		D51.setMinHeight(70);
		D51.setStyle("-fx-control-inner-background: #e0e0e0; -fx-background-color:black;-fx-text-inner-color: black;");
		D51.setFont(Font.font("Verdana", FontWeight.BOLD, 35));
		D52.setMaxWidth(70);
		D52.setMaxHeight(70);
		D52.setMinWidth(70);
		D52.setMinHeight(70);
		D52.setStyle("-fx-control-inner-background: #efefef; -fx-background-color:black;-fx-text-inner-color: black;-fx-border-color: black;-fx-border-width: 1 0 0 0px;");
		D52.setFont(Font.font("Verdana", FontWeight.BOLD, 35));
		D53.setMaxWidth(70);
		D53.setMaxHeight(70);
		D53.setMinWidth(70);
		D53.setMinHeight(70);
		D53.setStyle("-fx-control-inner-background: #efefef; -fx-background-color:black;-fx-text-inner-color: black;");
		D53.setFont(Font.font("Verdana", FontWeight.BOLD, 35));
		D54.setMaxWidth(70);
		D54.setMaxHeight(70);
		D54.setMinWidth(70);
		D54.setMinHeight(70);
		D54.setStyle("-fx-control-inner-background: #efefef; -fx-background-color:black;-fx-text-inner-color: black;");
		D54.setFont(Font.font("Verdana", FontWeight.BOLD, 35));
		D55.setMaxWidth(70);
		D55.setMaxHeight(70);
		D55.setMinWidth(70);
		D55.setMinHeight(70);
		D55.setStyle("-fx-control-inner-background: #e0e0e0; -fx-background-color:black;-fx-text-inner-color: black;-fx-border-color: black;-fx-border-width: 0 0 0 1px;");
		D55.setFont(Font.font("Verdana", FontWeight.BOLD, 35));
		D56.setMaxWidth(70);
		D56.setMaxHeight(70);
		D56.setMinWidth(70);
		D56.setMinHeight(70);
		D56.setStyle("-fx-control-inner-background: #e0e0e0; -fx-text-inner-color: black; -fx-background-color:black;-fx-border-color: black;-fx-border-width: 0 0 0 1px;");
		D56.setFont(Font.font("Verdana", FontWeight.BOLD, 35));
		D57.setMaxWidth(70);
		D57.setMaxHeight(70);
		D57.setMinWidth(70);
		D57.setMinHeight(70);
		D57.setStyle("-fx-control-inner-background: #e0e0e0; -fx-background-color:black;-fx-text-inner-color: black;-fx-border-color: black;-fx-border-width: 0 0 0 1px;");
		D57.setFont(Font.font("Verdana", FontWeight.BOLD, 35));
		D58.setMaxWidth(70);
		D58.setMaxHeight(70);
		D58.setMinWidth(70);
		D58.setMinHeight(70);
		D58.setStyle("-fx-control-inner-background: #efefef; -fx-background-color:black;-fx-text-inner-color: black;-fx-border-color: black;-fx-border-width: 1 0 0 1px;");
		D58.setFont(Font.font("Verdana", FontWeight.BOLD, 35));
		D59.setMaxWidth(70);
		D59.setMaxHeight(70);
		D59.setMinWidth(70);
		D59.setMinHeight(70);
		D59.setStyle("-fx-control-inner-background: #efefef; -fx-background-color:black;-fx-text-inner-color: black;-fx-border-color: black;-fx-border-width: 0 0 0 1px;");
		D59.setFont(Font.font("Verdana", FontWeight.BOLD, 35));
		D60.setMaxWidth(70);
		D60.setMaxHeight(70);
		D60.setMinWidth(70);
		D60.setMinHeight(70);
		D60.setStyle("-fx-control-inner-background: #efefef; -fx-background-color:black;-fx-text-inner-color: black;-fx-border-color: black;-fx-border-width: 0 0 0 1px;");
		D60.setFont(Font.font("Verdana", FontWeight.BOLD, 35));
		D61.setMaxWidth(70);
		D61.setMaxHeight(70);
		D61.setMinWidth(70);
		D61.setMinHeight(70);
		D61.setStyle("-fx-control-inner-background: #e0e0e0; -fx-background-color:black;-fx-text-inner-color: black;-fx-border-color: black;-fx-border-width: 1 0 0 1px;");
		D61.setFont(Font.font("Verdana", FontWeight.BOLD, 35));
		D62.setMaxWidth(70);
		D62.setMaxHeight(70);
		D62.setMinWidth(70);
		D62.setMinHeight(70);
		D62.setStyle("-fx-control-inner-background: #e0e0e0; -fx-background-color:black;-fx-text-inner-color: black;-fx-border-color: black;-fx-border-width: 0 0 0 1px;");
		D62.setFont(Font.font("Verdana", FontWeight.BOLD, 35));
		D63.setMaxWidth(70);
		D63.setMaxHeight(70);
		D63.setMinWidth(70);
		D63.setMinHeight(70);
		D63.setStyle("-fx-control-inner-background: #e0e0e0; -fx-background-color:black;-fx-text-inner-color: black;-fx-border-color: black;-fx-border-width: 0 0 0 1px;" );
		D63.setFont(Font.font("Verdana", FontWeight.BOLD, 35));
		D64.setMaxWidth(70);
		D64.setMaxHeight(70);
		D64.setMinWidth(70);
		D64.setMinHeight(70);
		D64.setStyle("-fx-control-inner-background: #e0e0e0; -fx-background-color:black;-fx-text-inner-color: black;");
		D64.setFont(Font.font("Verdana", FontWeight.BOLD, 35));
		D65.setMaxWidth(70);
		D65.setMaxHeight(70);
		D65.setMinWidth(70);
		D65.setMinHeight(70);
		D65.setStyle("-fx-control-inner-background: #e0e0e0; -fx-background-color:black;-fx-text-inner-color: black;");
		D65.setFont(Font.font("Verdana", FontWeight.BOLD, 35));
		D66.setMaxWidth(70);
		D66.setMaxHeight(70);
		D66.setMinWidth(70);
		D66.setMinHeight(70);
		D66.setStyle("-fx-control-inner-background: #e0e0e0; -fx-background-color:black;-fx-text-inner-color: black;");
		D66.setFont(Font.font("Verdana", FontWeight.BOLD, 35));
		D67.setMaxWidth(70);
		D67.setMaxHeight(70);
		D67.setMinWidth(70);
		D67.setMinHeight(70);
		D67.setStyle("-fx-control-inner-background: #efefef; -fx-background-color:black;-fx-text-inner-color: black;-fx-border-color: black;-fx-border-width: 1 0 0 0px;");
		D67.setFont(Font.font("Verdana", FontWeight.BOLD, 35));
		D68.setMaxWidth(70);
		D68.setMaxHeight(70);
		D68.setMinWidth(70);
		D68.setMinHeight(70);
		D68.setStyle("-fx-control-inner-background: #efefef; -fx-background-color:black;-fx-text-inner-color: black;");
		D68.setFont(Font.font("Verdana", FontWeight.BOLD, 35));
		D69.setMaxWidth(70);
		D69.setMaxHeight(70);
		D69.setMinWidth(70);
		D69.setMinHeight(70);
		D69.setStyle("-fx-control-inner-background: #efefef; -fx-background-color:black;-fx-text-inner-color: black;");
		D69.setFont(Font.font("Verdana", FontWeight.BOLD, 35));
		D70.setMaxWidth(70);
		D70.setMaxHeight(70);
		D70.setMinWidth(70);
		D70.setMinHeight(70);
		D70.setStyle("-fx-control-inner-background: #e0e0e0; -fx-background-color:black;-fx-text-inner-color: black;-fx-border-color: black;-fx-border-width: 1 0 0 0px;");
		D70.setFont(Font.font("Verdana", FontWeight.BOLD, 35));
		D71.setMaxWidth(70);
		D71.setMaxHeight(70);
		D71.setMinWidth(70);
		D71.setMinHeight(70);
		D71.setStyle("-fx-control-inner-background: #e0e0e0; -fx-background-color:black;-fx-text-inner-color: black;");
		D71.setFont(Font.font("Verdana", FontWeight.BOLD, 35));
		D72.setMaxWidth(70);
		D72.setMaxHeight(70);
		D72.setMinWidth(70);
		D72.setMinHeight(70);
		D72.setStyle("-fx-control-inner-background: #e0e0e0; -fx-background-color:black;-fx-text-inner-color: black;");
		D72.setFont(Font.font("Verdana", FontWeight.BOLD, 35));
		D73.setMaxWidth(70);
		D73.setMaxHeight(70);
		D73.setMinWidth(70);
		D73.setMinHeight(70);
		D73.setStyle("-fx-control-inner-background: #e0e0e0; -fx-background-color:black;-fx-text-inner-color: black;");
		D73.setFont(Font.font("Verdana", FontWeight.BOLD, 35));
		D74.setMaxWidth(70);
		D74.setMaxHeight(70);
		D74.setMinWidth(70);
		D74.setMinHeight(70);
		D74.setStyle("-fx-control-inner-background: #e0e0e0; -fx-background-color:black;-fx-text-inner-color: black;");
		D74.setFont(Font.font("Verdana", FontWeight.BOLD, 35));
		D75.setMaxWidth(70);
		D75.setMaxHeight(70);
		D75.setMinWidth(70);
		D75.setMinHeight(70);
		D75.setStyle("-fx-control-inner-background: #e0e0e0; -fx-background-color:black;-fx-text-inner-color: black;");
		D75.setFont(Font.font("Verdana", FontWeight.BOLD, 35));
		D76.setMaxWidth(70);
		D76.setMaxHeight(70);
		D76.setMinWidth(70);
		D76.setMinHeight(70);
		D76.setStyle("-fx-control-inner-background: #efefef; -fx-background-color:black;-fx-text-inner-color: black;-fx-border-color: black;-fx-border-width: 1 0 0 0px;");
		D76.setFont(Font.font("Verdana", FontWeight.BOLD, 35));
		D77.setMaxWidth(70);
		D77.setMaxHeight(70);
		D77.setMinWidth(70);
		D77.setMinHeight(70);
		D77.setStyle("-fx-control-inner-background: #efefef; -fx-background-color:black;-fx-text-inner-color: black;");
		D77.setFont(Font.font("Verdana", FontWeight.BOLD, 35));
		D78.setMaxWidth(70);
		D78.setMaxHeight(70);
		D78.setMinWidth(70);
		D78.setMinHeight(70);
		D78.setStyle("-fx-control-inner-background: #efefef; -fx-background-color:black;-fx-text-inner-color: black;");
		D78.setFont(Font.font("Verdana", FontWeight.BOLD, 35));
		D79.setMaxWidth(70);
		D79.setMaxHeight(70);
		D79.setMinWidth(70);
		D79.setMinHeight(70);
		D79.setStyle("-fx-control-inner-background: #e0e0e0; -fx-background-color:black;-fx-text-inner-color: black;-fx-border-color: black;-fx-border-width: 1 0 0 0px;");
		D79.setFont(Font.font("Verdana", FontWeight.BOLD, 35));
		D80.setMaxWidth(70);
		D80.setMaxHeight(70);
		D80.setMinWidth(70);
		D80.setMinHeight(70);
		D80.setStyle("-fx-control-inner-background: #e0e0e0; -fx-background-color:black;-fx-text-inner-color: black;");
		D80.setFont(Font.font("Verdana", FontWeight.BOLD, 35));
		D81.setMaxWidth(70);
		D81.setMaxHeight(70);
		D81.setMinWidth(70);
		D81.setMinHeight(70);
		D81.setStyle("-fx-control-inner-background: #e0e0e0; -fx-background-color:black;-fx-text-inner-color: black;");
		D81.setFont(Font.font("Verdana", FontWeight.BOLD, 35));

		Brutedoku.setMinWidth(140);
		Brutedoku.setMaxHeight(50);
		Brutedoku.setStyle("-fx-background-color:#bababa; -fx-border-color: black;-fx-text-fill: black;-fx-border-width: 2 6 2 6px; -fx-border-radius:20;-fx-background-radius: 20;");
		Brutedoku.setFont(Font.font("Verdana", FontWeight.BOLD, 25));
		
		FlowPane suDoku = new FlowPane(Orientation.VERTICAL);
		suDoku.getChildren().addAll(D1,D2,D3,D4,D5,D6,D7,D8,D9,D10,D11,D12,D13,D14,D15,D16,D17,D18,D19,D20,D21,D22,D23,D24,D25,D26,D27,D28,D29,D30,D31,D32,D33,D34,D35,D36,D37,D38,D39,D40,D41,D42,D43,D44,D45,D46,D47,D48,D49,D50,D51,D52,D53,D54,D55,D56,D57,D58,D59,D60,D61,D62,D63,D64,D65,D66,D67,D68,D69,D70,D71,D72,D73,D74,D75,D76,D77,D78,D79,D80,D81);
		suDoku.setPrefWrapLength(630);
		
		timelabel.setFont(Font.font("Verdana", FontWeight.BOLD, 15));
		VBox BruteDoku = new VBox(5);
		BruteDoku.setStyle("-fx-background-color: #eaeaea; -fx-border-color: black;");
		BruteDoku.getChildren().addAll(timelabel, Brutedoku);
		BruteDoku.setAlignment(Pos.CENTER);
		
		BorderPane Sudoku = new BorderPane();
		Sudoku.setBottom(BruteDoku);
		Sudoku.setCenter(suDoku);
		
		getDoku.setScene(new Scene(Sudoku,630,710));
		getDoku.setTitle("BruteDoku");
		getDoku.show();
		
		Brutedoku.setOnAction(e -> {
			if(Brutedoku.getText() == "Reset") {
				resetbut();
			} else {
			 D1.setEditable(false);   
			 D2.setEditable(false);     
			 D3.setEditable(false);  
			 D4.setEditable(false);  
			 D5.setEditable(false);  
			 D6.setEditable(false);  
			 D7.setEditable(false);     
			 D8.setEditable(false);     
			 D9.setEditable(false);     
			 D10.setEditable(false);     
			 D11.setEditable(false);     
			 D12.setEditable(false);     
			 D13.setEditable(false);     
			 D14.setEditable(false);     
			 D15.setEditable(false);     
			 D16.setEditable(false);     
			 D17.setEditable(false);     
			 D18.setEditable(false);     
			 D19.setEditable(false);     
			 D20.setEditable(false);     
			 D21.setEditable(false);     
			 D22.setEditable(false);     
			 D23.setEditable(false);     
			 D24.setEditable(false);     
			 D25.setEditable(false);     
			 D26.setEditable(false);     
			 D27.setEditable(false);     
			 D28.setEditable(false);     
			 D29.setEditable(false);     
			 D30.setEditable(false);     
			 D31.setEditable(false);     
			 D32.setEditable(false);     
			 D33.setEditable(false);     
			 D34.setEditable(false);     
			 D35.setEditable(false);     
			 D36.setEditable(false);     
			 D37.setEditable(false);     
			 D38.setEditable(false);     
			 D39.setEditable(false);     
			 D40.setEditable(false);     
			 D41.setEditable(false);     
			 D42.setEditable(false);     
			 D43.setEditable(false);     
			 D44.setEditable(false);     
			 D45.setEditable(false);     
			 D46.setEditable(false);     
			 D47.setEditable(false);     
			 D48.setEditable(false);     
			 D49.setEditable(false);     
			 D50.setEditable(false);     
			 D51.setEditable(false);     
			 D52.setEditable(false);     
			 D53.setEditable(false);     
			 D54.setEditable(false);     
			 D55.setEditable(false);     
			 D56.setEditable(false);     
			 D57.setEditable(false);     
			 D58.setEditable(false);     
			 D59.setEditable(false);     
			 D60.setEditable(false);     
			 D61.setEditable(false);     
			 D62.setEditable(false);     
			 D63.setEditable(false);     
			 D64.setEditable(false);     
			 D65.setEditable(false);     
			 D66.setEditable(false);     
			 D67.setEditable(false);     
			 D68.setEditable(false);     
			 D69.setEditable(false);     
			 D70.setEditable(false);     
			 D71.setEditable(false);     
			 D72.setEditable(false);     
			 D73.setEditable(false);     
			 D74.setEditable(false);     
			 D75.setEditable(false);     
			 D76.setEditable(false);     
			 D77.setEditable(false);     
			 D78.setEditable(false);     
			 D79.setEditable(false);     
			 D80.setEditable(false);     
			 D81.setEditable(false);
			 
			 int NoValue = 0;
			 int Value = 0;
		
			 if(D1.getLength() == 0) {
				 Value = NoValue;
			 }else {
				 Value = Integer.parseInt(D1.getText());
			 }
			 DokuSolve[0][0] = Value;
			 DokuCopy[0][0] = Value;
			 
			 if(D2.getLength() == 0) {
				 Value = NoValue;
			 }else {
				 Value = Integer.parseInt(D2.getText());
			 }
			 DokuSolve[0][1] = Value;
			 DokuCopy[0][1] = Value;
			 
			 if(D3.getLength() == 0) {
				 Value = NoValue;
			 }else {
				 Value = Integer.parseInt(D3.getText());
			 }
			 DokuSolve[0][2] = Value;
			 DokuCopy[0][2] = Value;
			 
			 if(D4.getLength() == 0) {
				 Value = NoValue;
			 }else {
				 Value = Integer.parseInt(D4.getText());
			 }
			 DokuSolve[0][3] = Value;
			 DokuCopy[0][3] = Value;
			 
			 if(D5.getLength() == 0) {
				 Value = NoValue;
			 }else {
				 Value = Integer.parseInt(D5.getText());
			 }
			 DokuSolve[0][4] = Value;
			 DokuCopy[0][4] = Value;
			 
			 if(D6.getLength() == 0) {
				 Value = NoValue;
			 }else {
				 Value = Integer.parseInt(D6.getText());
			 }
			 DokuSolve[0][5] = Value;
			 DokuCopy[0][5] = Value;
			 
			 if(D7.getLength() == 0) {
				 Value = NoValue;
			 }else {
				 Value = Integer.parseInt(D7.getText());
			 }
			 DokuSolve[0][6] = Value;
			 DokuCopy[0][6] = Value;
			 
			 if(D8.getLength() == 0) {
				 Value = NoValue;
			 }else {
				 Value = Integer.parseInt(D8.getText());
			 }
			 DokuSolve[0][7] = Value;
			 DokuCopy[0][7] = Value;
			 
			 if(D9.getLength() == 0) {
				 Value = NoValue;
			 }else {
				 Value = Integer.parseInt(D9.getText());
			 }
			 DokuSolve[0][8] = Value;
			 DokuCopy[0][8] = Value;
			 
			 if(D10.getLength() == 0) {
				 Value = NoValue;
			 }else {
				 Value = Integer.parseInt(D10.getText());
			 }
			 DokuSolve[1][0] = Value;
			 DokuCopy[1][0] = Value;
			 
			 if(D11.getLength() == 0) {
				 Value = NoValue;
			 }else {
				 Value = Integer.parseInt(D11.getText());
			 }
			 DokuSolve[1][1] = Value;
			 DokuCopy[1][1] = Value;
			 
			 if(D12.getLength() == 0) {
				 Value = NoValue;
			 }else {
				 Value = Integer.parseInt(D12.getText());
			 }
			 DokuSolve[1][2] = Value;
			 DokuCopy[1][2] = Value;
			 
			 if(D13.getLength() == 0) {
				 Value = NoValue;
			 }else {
				 Value = Integer.parseInt(D13.getText());
			 }
			 DokuSolve[1][3] = Value;
			 DokuCopy[1][3] = Value;
			 
			 if(D14.getLength() == 0) {
				 Value = NoValue;
			 }else {
				 Value = Integer.parseInt(D14.getText());
			 }
			 DokuSolve[1][4] = Value;
			 DokuCopy[1][4] = Value;
			 
			 if(D15.getLength() == 0) {
				 Value = NoValue;
			 }else {
				 Value = Integer.parseInt(D15.getText());
			 }
			 DokuSolve[1][5] = Value;
			 DokuCopy[1][5] = Value;
			 
			 if(D16.getLength() == 0) {
				 Value = NoValue;
			 }else {
				 Value = Integer.parseInt(D16.getText());
			 }
			 DokuSolve[1][6] = Value;
			 DokuCopy[1][6] = Value;
			 
			 if(D17.getLength() == 0) {
				 Value = NoValue;
			 }else {
				 Value = Integer.parseInt(D17.getText());
			 }
			 DokuSolve[1][7] = Value;
			 DokuCopy[1][7] = Value;
			 
			 if(D18.getLength() == 0) {
				 Value = NoValue;
			 }else {
				 Value = Integer.parseInt(D18.getText());
			 }
			 DokuSolve[1][8] = Value;
			 DokuCopy[1][8] = Value;
			 
			 if(D19.getLength() == 0) {
				 Value = NoValue;
			 }else {
				 Value = Integer.parseInt(D19.getText());
			 }
			 DokuSolve[2][0] = Value;
			 DokuCopy[2][0] = Value;
			 
			 if(D20.getLength() == 0) {
				 Value = NoValue;
			 }else {
				 Value = Integer.parseInt(D20.getText());
			 }
			 DokuSolve[2][1] = Value;
			 DokuCopy[2][1] = Value;
			
			 if(D21.getLength() == 0) {
				 Value = NoValue;
			 }else {
				 Value = Integer.parseInt(D21.getText());
			 }
			 DokuSolve[2][2] = Value;
			 DokuCopy[2][2] = Value;
			 
			 if(D22.getLength() == 0) {
				 Value = NoValue;
			 }else {
				 Value = Integer.parseInt(D22.getText());
			 }
			 DokuSolve[2][3] = Value;
			 DokuCopy[2][3] = Value;
			 
			 if(D23.getLength() == 0) {
				 Value = NoValue;
			 }else {
				 Value = Integer.parseInt(D23.getText());
			 }
			 DokuSolve[2][4] = Value;
			 DokuCopy[2][4] = Value;
			 
			 if(D24.getLength() == 0) {
				 Value = NoValue;
			 }else {
				 Value = Integer.parseInt(D24.getText());
			 }
			 DokuSolve[2][5] = Value;
			 DokuCopy[2][5] = Value;
			 
			 if(D25.getLength() == 0) {
				 Value = NoValue;
			 }else {
				 Value = Integer.parseInt(D25.getText());
			 }
			 DokuSolve[2][6] = Value;
			 DokuCopy[2][6] = Value;
			 
			 if(D26.getLength() == 0) {
				 Value = NoValue;
			 }else {
				 Value = Integer.parseInt(D26.getText());
			 }
			 DokuSolve[2][7] = Value;
			 DokuCopy[2][7] = Value;
			 
			 if(D27.getLength() == 0) {
				 Value = NoValue;
			 }else {
				 Value = Integer.parseInt(D27.getText());
			 }
			 DokuSolve[2][8] = Value;
			 DokuCopy[2][8] = Value;
			 
			 if(D28.getLength() == 0) {
				 Value = NoValue;
			 }else {
				 Value = Integer.parseInt(D28.getText());
			 }
			 DokuSolve[3][0] = Value;
			 DokuCopy[3][0] = Value;
			 
			 if(D29.getLength() == 0) {
				 Value = NoValue;
			 }else {
				 Value = Integer.parseInt(D29.getText());
			 }
			 DokuSolve[3][1] = Value;
			 DokuCopy[3][1] = Value;
			 
			 if(D30.getLength() == 0) {
				 Value = NoValue;
			 }else {
				 Value = Integer.parseInt(D30.getText());
			 }
			 DokuSolve[3][2] = Value;
			 DokuCopy[3][2] = Value;
			 
			 if(D31.getLength() == 0) {
				 Value = NoValue;
			 }else {
				 Value = Integer.parseInt(D31.getText());
			 }
			 DokuSolve[3][3] = Value;
			 DokuCopy[3][3] = Value;
			 
			 if(D32.getLength() == 0) {
				 Value = NoValue;
			 }else {
				 Value = Integer.parseInt(D32.getText());
			 }
			 DokuSolve[3][4] = Value;
			 DokuCopy[3][4] = Value;
			 
			 if(D33.getLength() == 0) {
				 Value = NoValue;
			 }else {
				 Value = Integer.parseInt(D33.getText());
			 }
			 DokuSolve[3][5] = Value;
			 DokuCopy[3][5] = Value;
			 
			 if(D34.getLength() == 0) {
				 Value = NoValue;
			 }else {
				 Value = Integer.parseInt(D34.getText());
			 }
			 DokuSolve[3][6] = Value;
			 DokuCopy[3][6] = Value;
			 
			 if(D35.getLength() == 0) {
				 Value = NoValue;
			 }else {
				 Value = Integer.parseInt(D35.getText());
			 }
			 DokuSolve[3][7] = Value;
			 DokuCopy[3][7] = Value;
			 
			 if(D36.getLength() == 0) {
				 Value = NoValue;
			 }else {
				 Value = Integer.parseInt(D36.getText());
			 }
			 DokuSolve[3][8] = Value;
			 DokuCopy[3][8] = Value;
			 
			 if(D37.getLength() == 0) {
				 Value = NoValue;
			 }else {
				 Value = Integer.parseInt(D37.getText());
			 }
			 DokuSolve[4][0] = Value;
			 DokuCopy[4][0] = Value;
			 
			 if(D38.getLength() == 0) {
				 Value = NoValue;
			 }else {
				 Value = Integer.parseInt(D38.getText());
			 }
			 DokuSolve[4][1] = Value;
			 DokuCopy[4][1] = Value;
			 
			 if(D39.getLength() == 0) {
				 Value = NoValue;
			 }else {
				 Value = Integer.parseInt(D39.getText());
			 }
			 DokuSolve[4][2] = Value;
			 DokuCopy[4][2] = Value;
			 
			 if(D40.getLength() == 0) {
				 Value = NoValue;
			 }else {
				 Value = Integer.parseInt(D40.getText());
			 }
			 DokuSolve[4][3] = Value;
			 DokuCopy[4][3] = Value;
			 
			 if(D41.getLength() == 0) {
				 Value = NoValue;
			 }else {
				 Value = Integer.parseInt(D41.getText());
			 }
			 DokuSolve[4][4] = Value;
			 DokuCopy[4][4] = Value;
			 
			 if(D42.getLength() == 0) {
				 Value = NoValue;
			 }else {
				 Value = Integer.parseInt(D42.getText());
			 }
			 DokuSolve[4][5] = Value;
			 DokuCopy[4][5] = Value;
			 
			 if(D43.getLength() == 0) {
				 Value = NoValue;
			 }else {
				 Value = Integer.parseInt(D43.getText());
			 }
			 DokuSolve[4][6] = Value;
			 DokuCopy[4][6] = Value;
			 
			 if(D44.getLength() == 0) {
				 Value = NoValue;
			 }else {
				 Value = Integer.parseInt(D44.getText());
			 }
			 DokuSolve[4][7] = Value;
			 DokuCopy[4][7] = Value;
			 
			 if(D45.getLength() == 0) {
				 Value = NoValue;
			 }else {
				 Value = Integer.parseInt(D45.getText());
			 }
			 DokuSolve[4][8] = Value;
			 DokuCopy[4][8] = Value;
			 
			 if(D46.getLength() == 0) {
				 Value = NoValue;
			 }else {
				 Value = Integer.parseInt(D46.getText());
			 }
			 DokuSolve[5][0] = Value;
			 DokuCopy[5][0] = Value;
			 
			 if(D47.getLength() == 0) {
				 Value = NoValue;
			 }else {
				 Value = Integer.parseInt(D47.getText());
			 }
			 DokuSolve[5][1] = Value;
			 DokuCopy[5][1] = Value;
			 
			 if(D48.getLength() == 0) {
				 Value = NoValue;
			 }else {
				 Value = Integer.parseInt(D48.getText());
			 }
			 DokuSolve[5][2] = Value;
			 DokuCopy[5][2] = Value;
			 
			 if(D49.getLength() == 0) {
				 Value = NoValue;
			 }else {
				 Value = Integer.parseInt(D49.getText());
			 }
			 DokuSolve[5][3] = Value;
			 DokuCopy[5][3] = Value;
			 
			 if(D50.getLength() == 0) {
				 Value = NoValue;
			 }else {
				 Value = Integer.parseInt(D50.getText());
			 }
			 DokuSolve[5][4] = Value;
			 DokuCopy[5][4] = Value;

			 if(D51.getLength() == 0) {
				 Value = NoValue;
			 }else {
				 Value = Integer.parseInt(D51.getText());
			 }
			 DokuSolve[5][5] = Value;
			 DokuCopy[5][5] = Value;
			 
			 if(D52.getLength() == 0) {
				 Value = NoValue;
			 }else {
				 Value = Integer.parseInt(D52.getText());
			 }
			 DokuSolve[5][6] = Value;
			 DokuCopy[5][6] = Value;
			 
			 if(D53.getLength() == 0) {
				 Value = NoValue;
			 }else {
				 Value = Integer.parseInt(D53.getText());
			 }
			 DokuSolve[5][7] = Value;
			 DokuCopy[5][7] = Value;
			 
			 if(D54.getLength() == 0) {
				 Value = NoValue;
			 }else {
				 Value = Integer.parseInt(D54.getText());
			 }
			 DokuSolve[5][8] = Value;
			 DokuCopy[5][8] = Value;
			 
			 if(D55.getLength() == 0) {
				 Value = NoValue;
			 }else {
				 Value = Integer.parseInt(D55.getText());
			 }
			 DokuSolve[6][0] = Value;
			 DokuCopy[6][0] = Value;
			 
			 if(D56.getLength() == 0) {
				 Value = NoValue;
			 }else {
				 Value = Integer.parseInt(D56.getText());
			 }
			 DokuSolve[6][1] = Value;
			 DokuCopy[6][1] = Value;
			 
			 if(D57.getLength() == 0) {
				 Value = NoValue;
			 }else {
				 Value = Integer.parseInt(D57.getText());
			 }
			 DokuSolve[6][2] = Value;
			 DokuCopy[6][2] = Value;
			 
			 if(D58.getLength() == 0) {
				 Value = NoValue;
			 }else {
				 Value = Integer.parseInt(D58.getText());
			 }
			 DokuSolve[6][3] = Value;
			 DokuCopy[6][3] = Value;
			 
			 if(D59.getLength() == 0) {
				 Value = NoValue;
			 }else {
				 Value = Integer.parseInt(D59.getText());
			 }
			 DokuSolve[6][4] = Value;
			 DokuCopy[6][4] = Value;
			 
			 if(D60.getLength() == 0) {
				 Value = NoValue;
			 }else {
				 Value = Integer.parseInt(D60.getText());
			 }
			 DokuSolve[6][5] = Value;
			 DokuCopy[6][5] = Value;
			 
			 if(D61.getLength() == 0) {
				 Value = NoValue;
			 }else {
				 Value = Integer.parseInt(D61.getText());
			 }
			 DokuSolve[6][6] = Value;
			 DokuCopy[6][6] = Value;
			 
			 if(D62.getLength() == 0) {
				 Value = NoValue;
			 }else {
				 Value = Integer.parseInt(D62.getText());
			 }
			 DokuSolve[6][7] = Value;
			 DokuCopy[6][7] = Value;
			 
			 if(D63.getLength() == 0) {
				 Value = NoValue;
			 }else {
				 Value = Integer.parseInt(D63.getText());
			 }
			 DokuSolve[6][8] = Value;
			 DokuCopy[6][8] = Value;
			 
			 if(D64.getLength() == 0) {
				 Value = NoValue;
			 }else {
				 Value = Integer.parseInt(D64.getText());
			 }
			 DokuSolve[7][0] = Value;
			 DokuCopy[7][0] = Value;
			 
			 if(D65.getLength() == 0) {
				 Value = NoValue;
			 }else {
				 Value = Integer.parseInt(D65.getText());
			 }
			 DokuSolve[7][1] = Value;
			 DokuCopy[7][1] = Value;
			 
			 if(D66.getLength() == 0) {
				 Value = NoValue;
			 }else {
				 Value = Integer.parseInt(D66.getText());
			 }
			 DokuSolve[7][2] = Value;
			 DokuCopy[7][2] = Value;
			 
			 if(D67.getLength() == 0) {
				 Value = NoValue;
			 }else {
				 Value = Integer.parseInt(D67.getText());
			 }
			 DokuSolve[7][3] = Value;
			 DokuCopy[7][3] = Value;
			 
			 if(D68.getLength() == 0) {
				 Value = NoValue;
			 }else {
				 Value = Integer.parseInt(D68.getText());
			 }
			 DokuSolve[7][4] = Value;
			 DokuCopy[7][4] = Value;
			 
			 if(D69.getLength() == 0) {
				 Value = NoValue;
			 }else {
				 Value = Integer.parseInt(D69.getText());
			 }
			 DokuSolve[7][5] = Value;
			 DokuCopy[7][5] = Value;
			 
			 if(D70.getLength() == 0) {
				 Value = NoValue;
			 }else {
				 Value = Integer.parseInt(D70.getText());
			 }
			 DokuSolve[7][6] = Value;
			 DokuCopy[7][6] = Value;
			 
			 if(D71.getLength() == 0) {
				 Value = NoValue;
			 }else {
				 Value = Integer.parseInt(D71.getText());
			 }
			 DokuSolve[7][7] = Value;
			 DokuCopy[7][7] = Value;
			 
			 if(D72.getLength() == 0) {
				 Value = NoValue;
			 }else {
				 Value = Integer.parseInt(D72.getText());
			 }
			 DokuSolve[7][8] = Value;
			 DokuCopy[7][8] = Value;
			 
			 if(D73.getLength() == 0) {
				 Value = NoValue;
			 }else {
				 Value = Integer.parseInt(D73.getText());
			 }
			 DokuSolve[8][0] = Value;
			 DokuCopy[8][0] = Value;
			 
			 if(D74.getLength() == 0) {
				 Value = NoValue;
			 }else {
				 Value = Integer.parseInt(D74.getText());
			 }
			 DokuSolve[8][1] = Value;
			 DokuCopy[8][1] = Value;
			 
			 if(D75.getLength() == 0) {
				 Value = NoValue;
			 }else {
				 Value = Integer.parseInt(D75.getText());
			 }
			 DokuSolve[8][2] = Value;
			 DokuCopy[8][2] = Value;
			 
			 if(D76.getLength() == 0) {
				 Value = NoValue;
			 }else {
				 Value = Integer.parseInt(D76.getText());
			 }
			 DokuSolve[8][3] = Value;
			 DokuCopy[8][3] = Value;
			 
			 if(D77.getLength() == 0) {
				 Value = NoValue;
			 }else {
				 Value = Integer.parseInt(D77.getText());
			 }
			 DokuSolve[8][4] = Value;
			 DokuCopy[8][4] = Value;
			 
			 if(D78.getLength() == 0) {
				 Value = NoValue;
			 }else {
				 Value = Integer.parseInt(D78.getText());
			 }
			 DokuSolve[8][5] = Value;
			 DokuCopy[8][5] = Value;
			 
			 if(D79.getLength() == 0) {
				 Value = NoValue;
			 }else {
				 Value = Integer.parseInt(D79.getText());
			 }
			 DokuSolve[8][6] = Value;
			 DokuCopy[8][6] = Value;
			 
			 if(D80.getLength() == 0) {
				 Value = NoValue;
			 }else {
				 Value = Integer.parseInt(D80.getText());
			 }
			 DokuSolve[8][7] = Value;
			 DokuCopy[8][7] = Value;
			 
			 if(D81.getLength() == 0) {
				 Value = NoValue;
			 }else {
				 Value = Integer.parseInt(D81.getText());
			 }
			 DokuSolve[8][8] = Value;
			 DokuCopy[8][8] = Value;
			 
			 start = System.currentTimeMillis();
			 
			 invoer = false;
			 
			 while(NotSolved) {
				 Brute();
			 }
			 Brutedoku.setText("Reset");
			}
		});

	}
		
	public void Brute() {
		int teller = 0;
		int notnextY1 = -1, notnextY2 = -1, notnextY3 = -1, notnextY4 = -1, notnextY5 = -1, notnextY6 = -1, notnextY7 = -1, notnextY8 = -1, notnextY9 = -1;
		int notnextX1 = -1, notnextX2 = -1, notnextX3 = -1, notnextX4 = -1, notnextX5 = -1, notnextX6 = -1, notnextX7 = -1, notnextX8 = -1, notnextX9 = -1;
		int notnextG1 = -1, notnextG2 = -1, notnextG3 = -1, notnextG4 = -1, notnextG5 = -1, notnextG6 = -1, notnextG7 = -1, notnextG8 = -1, notnextG9 = -1;
		int next = minimum + 1;
		if(DokuCopy[dokulast][last] == 0) {
			for(int i = 0;  i < 9; i++) {
				if(DokuCopy[dokulast][i] != 0) {
					switch(DokuCopy[dokulast][i]) {
					case 1: notnextY1 = 1;
						break;
					case 2: notnextY2 = 2;
						break;
					case 3: notnextY3 = 3;
						break;
					case 4: notnextY4 = 4;
						break;
					case 5: notnextY5 = 5;
						break;
					case 6: notnextY6 = 6;
						break;
					case 7: notnextY7 = 7;
						break;
					case 8: notnextY8 = 8;
						break;
					case 9: notnextY9 = 9;
						break;
					}
				}
			}
			for(int i = 0; i < 9; i++) {
				if(DokuCopy[i][last] != 0) {
					switch(DokuCopy[i][last]) {
					case 1: notnextX1 = 1;
						break;
					case 2: notnextX2 = 2;
						break;
					case 3: notnextX3 = 3;
						break;
					case 4: notnextX4 = 4;
						break;
					case 5: notnextX5 = 5;
						break;
					case 6: notnextX6 = 6;
						break;
					case 7: notnextX7 = 7;
						break;
					case 8: notnextX8 = 8;
						break;
					case 9: notnextX9 = 9;
						break;
					}
				}
			}
			switch(WGrid()) {
				case 1: 
					int t = 0;
					for(int i = 0; t != 3; i++) {
						if( i == 3) {
							t++;
							i = 0;
							if(t == 3) {
								break;
							}
						}
						if(DokuCopy[i][t] != 0) {
							switch(DokuCopy[i][t]) {
							case 1: notnextG1 = 1;
								break;
							case 2: notnextG2 = 2;
								break;
							case 3: notnextG3 = 3;
								break;
							case 4: notnextG4 = 4;
								break;
							case 5: notnextG5 = 5;
								break;
							case 6: notnextG6 = 6;
								break;
							case 7: notnextG7 = 7;
								break;
							case 8: notnextG8 = 8;
								break;
							case 9: notnextG9 = 9;
								break;
						}
					}
				}
					break;
				case 2: 
					t = 0;
					for(int i = 3; t != 3; i++) {
						if( i == 6) {
							t++;
							i = 3;
							if(t == 3) {
								break;
							}
						}
						if(DokuCopy[i][t] != 0) {
							switch(DokuCopy[i][t]) {
							case 1: notnextG1 = 1;
								break;
							case 2: notnextG2 = 2;
								break;
							case 3: notnextG3 = 3;
								break;
							case 4: notnextG4 = 4;
								break;
							case 5: notnextG5 = 5;
								break;
							case 6: notnextG6 = 6;
								break;
							case 7: notnextG7 = 7;
								break;
							case 8: notnextG8 = 8;
								break;
							case 9: notnextG9 = 9;
								break;
						}
					}
				}
					break;
				case 3:
					t = 0;
					for(int i = 6; t != 3; i++) {
						if( i == 9) {
							t++;
							i = 6;
							if(t == 3) {
								break;
							}
						}
						if(DokuCopy[i][t] != 0) {
							switch(DokuCopy[i][t]) {
							case 1: notnextG1 = 1;
								break;
							case 2: notnextG2 = 2;
								break;
							case 3: notnextG3 = 3;
								break;
							case 4: notnextG4 = 4;
								break;
							case 5: notnextG5 = 5;
								break;
							case 6: notnextG6 = 6;
								break;
							case 7: notnextG7 = 7;
								break;
							case 8: notnextG8 = 8;
								break;
							case 9: notnextG9 = 9;
								break;
						}
					}
				}
					break;
				case 4:
					t = 3;
					for(int i = 0; t != 6; i++) {
						if( i == 3) {
							t++;
							i = 0;
							if(t == 6) {
								break;
							}
						}
						if(DokuCopy[i][t] != 0) {
							switch(DokuCopy[i][t]) {
							case 1: notnextG1 = 1;
								break;
							case 2: notnextG2 = 2;
								break;
							case 3: notnextG3 = 3;
								break;
							case 4: notnextG4 = 4;
								break;
							case 5: notnextG5 = 5;
								break;
							case 6: notnextG6 = 6;
								break;
							case 7: notnextG7 = 7;
								break;
							case 8: notnextG8 = 8;
								break;
							case 9: notnextG9 = 9;
								break;
						}
					}
				}
					break;
				case 5:
					t = 3;
					for(int i = 3; t != 6; i++) {
						if( i == 6) {
							t++;
							i = 3;
							if(t == 6) {
								break;
							}
						}
						if(DokuCopy[i][t] != 0) {
							switch(DokuCopy[i][t]) {
							case 1: notnextG1 = 1;
								break;
							case 2: notnextG2 = 2;
								break;
							case 3: notnextG3 = 3;
								break;
							case 4: notnextG4 = 4;
								break;
							case 5: notnextG5 = 5;
								break;
							case 6: notnextG6 = 6;
								break;
							case 7: notnextG7 = 7;
								break;
							case 8: notnextG8 = 8;
								break;
							case 9: notnextG9 = 9;
								break;
						}
					}
				}
					break;
				case 6:
					t = 3;
					for(int i = 6; t != 6; i++) {
						
						if( i == 9) {
							t++;
							i = 6;
							if(t == 6) {
								break;
							}
						}
						if(DokuCopy[i][t] != 0) {
							switch(DokuCopy[i][t]) {
							case 1: notnextG1 = 1;
								break;
							case 2: notnextG2 = 2;
								break;
							case 3: notnextG3 = 3;
								break;
							case 4: notnextG4 = 4;
								break;
							case 5: notnextG5 = 5;
								break;
							case 6: notnextG6 = 6;
								break;
							case 7: notnextG7 = 7;
								break;
							case 8: notnextG8 = 8;
								break;
							case 9: notnextG9 = 9;
								break;
						}
					}
				}
					break;
				case 7:
					t = 6;
					for(int i = 0; t < 9 ; i++) {
						if( i == 3) {
							t++;
							i = 0;
							if(t == 9) {
								break;
							}
						}
						if(DokuCopy[i][t] != 0) {
							switch(DokuCopy[i][t]) {
							case 1: notnextG1 = 1;
								break;
							case 2: notnextG2 = 2;
								break;
							case 3: notnextG3 = 3;
								break;
							case 4: notnextG4 = 4;
								break;
							case 5: notnextG5 = 5;
								break;
							case 6: notnextG6 = 6;
								break;
							case 7: notnextG7 = 7;
								break;
							case 8: notnextG8 = 8;
								break;
							case 9: notnextG9 = 9;
								break;
						}
					}
				}
					break;
				case 8:
					t = 6;
					for(int i = 3; t != 9; i++) {
						if( i == 6) {
							t++;
							i = 3;
							if(t == 9) {
								break;
							}
						}
						if(DokuCopy[i][t] != 0) {
							switch(DokuCopy[i][t]) {
							case 1: notnextG1 = 1;
								break;
							case 2: notnextG2 = 2;
								break;
							case 3: notnextG3 = 3;
								break;
							case 4: notnextG4 = 4;
								break;
							case 5: notnextG5 = 5;
								break;
							case 6: notnextG6 = 6;
								break;
							case 7: notnextG7 = 7;
								break;
							case 8: notnextG8 = 8;
								break;
							case 9: notnextG9 = 9;
								break;
						}
					}
				}
					break;
				case 9:
					t = 6;
					for(int i = 6; t != 9; i++) {
						if( i == 9) {
							t++;
							i = 6;
							if(t == 9) {
								break;
							}
						}
						if(DokuCopy[i][t] != 0) {
							switch(DokuCopy[i][t]) {
							case 1: notnextG1 = 1;
								break;
							case 2: notnextG2 = 2;
								break;
							case 3: notnextG3 = 3;
								break;
							case 4: notnextG4 = 4;
								break;
							case 5: notnextG5 = 5;
								break;
							case 6: notnextG6 = 6;
								break;
							case 7: notnextG7 = 7;
								break;
							case 8: notnextG8 = 8;
								break;
							case 9: notnextG9 = 9;
								break;
						}
					}
				}
					break;
			}
				if(teller != 11) {
					
					while(next == notnextY1 || next == notnextY2 || next == notnextY3 || next == notnextY4 || next == notnextY5 || next == notnextY6 || next == notnextY7 || next == notnextY8 || next == notnextY9 || next == notnextX1 || next == notnextX2 || next == notnextX3 || next == notnextX4 || next == notnextX5 || next == notnextX6 || next == notnextX7 || next == notnextX8 || next == notnextX9 || next == notnextG1 || next == notnextG2 || next == notnextG3 || next == notnextG4 || next == notnextG5 || next == notnextG6 || next == notnextG7 || next == notnextG8 || next == notnextG9) {
						next++;
					}
				}
				if(next == 10 && dokulast == 0 && last == 0) {
				}else if(next == 10) {
					boolean nogeenkeer = true;
					do {
						if(last-goback != -1) {
							if(DokuSolve[dokulast][last - goback] == 0) {
								minimum = DokuCopy[dokulast][last - goback];
								last = last-goback;
								DokuCopy[dokulast][last] = 0;
								goback = 1;
								nogeenkeer = false;
							} else {
								goback++;
								}
						} else {
							dokulast--;
							last = 9;
							goback = 1;
						}
					}while(nogeenkeer);
				} else {
					minimum = 0;
					goback = 1;
					DokuCopy[dokulast][last] = next;
				}
		
		}else if(dokulast == 8 && last == 8) {
			howlong();
			NotSolved = false;
			Toimage();
		}else {
			last++;
			if(last == 9) {
				last = 0;
				dokulast++;
			}		
		}
	}
	public int WGrid() {
		int GridX = 0;
		int GridY = 0;
		int Grid = 0;
		
		if(dokulast > 5) {
			GridX = 3;
		}else if(dokulast > 2) {
			GridX = 2;
		}else if(dokulast > -1) {
			GridX = 1;
		}
		if(last > 5) {
			GridY = 3;
		}else if(last > 2) {
			GridY = 2;
		}else if(last > -1) {
			GridY = 1;
		}
		if(GridX == 1 && GridY == 1) {
			Grid = 1;
		}else if(GridX == 1 && GridY == 2) {
			Grid = 4;
		}else if(GridX == 1 && GridY == 3) {
			Grid = 7;
		}else if(GridX == 2 && GridY == 1) {
			Grid = 2;
		}else if(GridX == 2 && GridY == 2) {
			Grid = 5;
		}else if(GridX == 2 && GridY == 3) {
			Grid = 8;
		}else if(GridX == 3 && GridY == 1) {
			Grid = 3;
		}else if(GridX == 3 && GridY == 2) {
			Grid = 6;
		}else if(GridX == 3 && GridY == 3) {
			Grid = 9;
		}
		return Grid;
	}
	public void Toimage() {
		int t = 0;
		int i = -1;
		while(t < 10) {
			i++;
			sb.delete(0, 1);
			if(i == 9) {
				t++;
				i = 0;
			}
			if(t == 0 && i == 0 && DokuSolve[t][i] == 0) {
				sb.append(DokuCopy[t][i]);
				D1.setText(sb.toString());
				D1.setStyle(D1.getStyle() + "-fx-text-inner-color:green;");
			} else if(t == 0 && i == 1 && DokuSolve[t][i] == 0) {
				sb.append(DokuCopy[t][i]);
				D2.setText(sb.toString());
				D2.setStyle(D2.getStyle() + "-fx-text-inner-color:green;");
			} else if(t == 0 && i == 2 && DokuSolve[t][i] == 0) {
				sb.append(DokuCopy[t][i]);
				D3.setText(sb.toString());
				D3.setStyle(D3.getStyle() + "-fx-text-inner-color:green;");
			} else if(t == 0 && i == 3 && DokuSolve[t][i] == 0) {
				sb.append(DokuCopy[t][i]);
				D4.setText(sb.toString());
				D4.setStyle(D4.getStyle() + "-fx-text-inner-color:green;");
			} else if(t == 0 && i == 4 && DokuSolve[t][i] == 0) {
				sb.append(DokuCopy[t][i]);
				D5.setText(sb.toString());
				D5.setStyle(D5.getStyle() + "-fx-text-inner-color:green;");
			} else if(t == 0 && i == 5 && DokuSolve[t][i] == 0) {
				sb.append(DokuCopy[t][i]);
				D6.setText(sb.toString());
				D6.setStyle(D6.getStyle() + "-fx-text-inner-color:green;");
			} else if(t == 0 && i == 6 && DokuSolve[t][i] == 0) {
				sb.append(DokuCopy[t][i]);
				D7.setText(sb.toString());
				D7.setStyle(D7.getStyle() + "-fx-text-inner-color:green;");
			} else if(t == 0 && i == 7 && DokuSolve[t][i] == 0) {
				sb.append(DokuCopy[t][i]);
				D8.setText(sb.toString());
				D8.setStyle(D8.getStyle() + "-fx-text-inner-color:green;");
			} else if(t == 0 && i == 8 && DokuSolve[t][i] == 0) {
				sb.append(DokuCopy[t][i]);
				D9.setText(sb.toString());
				D9.setStyle(D9.getStyle() + "-fx-text-inner-color:green;");
			} else if(t == 1 && i == 0 && DokuSolve[t][i] == 0) {
				sb.append(DokuCopy[t][i]);
				D10.setText(sb.toString());
				D10.setStyle(D10.getStyle() + "-fx-text-inner-color:green;");
			} else if(t == 1 && i == 1 && DokuSolve[t][i] == 0) {
				sb.append(DokuCopy[t][i]);
				D11.setText(sb.toString());
				D11.setStyle(D11.getStyle() + "-fx-text-inner-color:green;");
			} else if(t == 1 && i == 2 && DokuSolve[t][i] == 0) {
				sb.append(DokuCopy[t][i]);
				D12.setText(sb.toString());
				D12.setStyle(D12.getStyle() + "-fx-text-inner-color:green;");
			} else if(t == 1 && i == 3 && DokuSolve[t][i] == 0) {
				sb.append(DokuCopy[t][i]);
				D13.setText(sb.toString());
				D13.setStyle(D13.getStyle() + "-fx-text-inner-color:green;");
			} else if(t == 1 && i == 4 && DokuSolve[t][i] == 0) {
				sb.append(DokuCopy[t][i]);
				D14.setText(sb.toString());
				D14.setStyle(D14.getStyle() + "-fx-text-inner-color:green;");
			} else if(t == 1 && i == 5 && DokuSolve[t][i] == 0) {
				sb.append(DokuCopy[t][i]);
				D15.setText(sb.toString());
				D15.setStyle(D15.getStyle() + "-fx-text-inner-color:green;");
			} else if(t == 1 && i == 6 && DokuSolve[t][i] == 0) {
				sb.append(DokuCopy[t][i]);
				D16.setText(sb.toString());
				D16.setStyle(D16.getStyle() + "-fx-text-inner-color:green;");
			} else if(t == 1 && i == 7 && DokuSolve[t][i] == 0) {
				sb.append(DokuCopy[t][i]);
				D17.setText(sb.toString());
				D17.setStyle(D17.getStyle() + "-fx-text-inner-color:green;");
			} else if(t == 1 && i == 8 && DokuSolve[t][i] == 0) {
				sb.append(DokuCopy[t][i]);
				D18.setText(sb.toString());
				D18.setStyle(D18.getStyle() + "-fx-text-inner-color:green;");
			} else if(t == 2 && i == 0 && DokuSolve[t][i] == 0) {
				sb.append(DokuCopy[t][i]);
				D19.setText(sb.toString());
				D19.setStyle(D19.getStyle() + "-fx-text-inner-color:green;");
			} else if(t == 2 && i == 1 && DokuSolve[t][i] == 0) {
				sb.append(DokuCopy[t][i]);
				D20.setText(sb.toString());
				D20.setStyle(D20.getStyle() + "-fx-text-inner-color:green;");
			} else if(t == 2 && i == 2 && DokuSolve[t][i] == 0) {
				sb.append(DokuCopy[t][i]);
				D21.setText(sb.toString());
				D21.setStyle(D21.getStyle() + "-fx-text-inner-color:green;");
			} else if(t == 2 && i == 3 && DokuSolve[t][i] == 0) {
				sb.append(DokuCopy[t][i]);
				D22.setText(sb.toString());
				D22.setStyle(D22.getStyle() + "-fx-text-inner-color:green;");
			} else if(t == 2 && i == 4 && DokuSolve[t][i] == 0) {
				sb.append(DokuCopy[t][i]);
				D23.setText(sb.toString());
				D23.setStyle(D23.getStyle() + "-fx-text-inner-color:green;");
			} else if(t == 2 && i == 5 && DokuSolve[t][i] == 0) {
				sb.append(DokuCopy[t][i]);
				D24.setText(sb.toString());
				D24.setStyle(D24.getStyle() + "-fx-text-inner-color:green;");
			} else if(t == 2 && i == 6 && DokuSolve[t][i] == 0) {
				sb.append(DokuCopy[t][i]);
				D25.setText(sb.toString()); 
				D25.setStyle(D25.getStyle() + "-fx-text-inner-color:green;");
			} else if(t == 2 && i == 7 && DokuSolve[t][i] == 0) {
				sb.append(DokuCopy[t][i]);
				D26.setText(sb.toString());
				D26.setStyle(D26.getStyle() + "-fx-text-inner-color:green;");
			} else if(t == 2 && i == 8 && DokuSolve[t][i] == 0) {
				sb.append(DokuCopy[t][i]);
				D27.setText(sb.toString());
				D27.setStyle(D27.getStyle() + "-fx-text-inner-color:green;");
			} else if(t == 3 && i == 0 && DokuSolve[t][i] == 0) {
				sb.append(DokuCopy[t][i]);
				D28.setText(sb.toString());
				D28.setStyle(D28.getStyle() + "-fx-text-inner-color:green;");
			} else if(t == 3 && i == 1 && DokuSolve[t][i] == 0) {
				sb.append(DokuCopy[t][i]);
				D29.setText(sb.toString());
				D29.setStyle(D29.getStyle() + "-fx-text-inner-color:green;");
			} else if(t == 3 && i == 2 && DokuSolve[t][i] == 0) {
				sb.append(DokuCopy[t][i]);
				D30.setText(sb.toString());
				D30.setStyle(D30.getStyle() + "-fx-text-inner-color:green;");
			} else if(t == 3 && i == 3 && DokuSolve[t][i] == 0) {
				sb.append(DokuCopy[t][i]);
				D31.setText(sb.toString());
				D31.setStyle(D31.getStyle() + "-fx-text-inner-color:green;");
			} else if(t == 3 && i == 4 && DokuSolve[t][i] == 0) {
				sb.append(DokuCopy[t][i]);
				D32.setText(sb.toString());
				D32.setStyle(D32.getStyle() + "-fx-text-inner-color:green;");
			} else if(t == 3 && i == 5 && DokuSolve[t][i] == 0) {
				sb.append(DokuCopy[t][i]);
				D33.setText(sb.toString());
				D33.setStyle(D33.getStyle() + "-fx-text-inner-color:green;");
			} else if(t == 3 && i == 6 && DokuSolve[t][i] == 0) {
				sb.append(DokuCopy[t][i]);
				D34.setText(sb.toString());
				D34.setStyle(D34.getStyle() + "-fx-text-inner-color:green;");
			} else if(t == 3 && i == 7 && DokuSolve[t][i] == 0) {
				sb.append(DokuCopy[t][i]);
				D35.setText(sb.toString());
				D35.setStyle(D35.getStyle() + "-fx-text-inner-color:green;");
			} else if(t == 3 && i == 8 && DokuSolve[t][i] == 0) {
				sb.append(DokuCopy[t][i]);
				D36.setText(sb.toString());
				D36.setStyle(D36.getStyle() + "-fx-text-inner-color:green;");
			} else if(t == 4 && i == 0 && DokuSolve[t][i] == 0) {
				sb.append(DokuCopy[t][i]);
				D37.setText(sb.toString());
				D37.setStyle(D37.getStyle() + "-fx-text-inner-color:green;");
			} else if(t == 4 && i == 1 && DokuSolve[t][i] == 0) {
				sb.append(DokuCopy[t][i]);
				D38.setText(sb.toString());
				D38.setStyle(D38.getStyle() + "-fx-text-inner-color:green;");
			} else if(t == 4 && i == 2 && DokuSolve[t][i] == 0) {
				sb.append(DokuCopy[t][i]);
				D39.setText(sb.toString());
				D39.setStyle(D39.getStyle() + "-fx-text-inner-color:green;");
			} else if(t == 4 && i == 3 && DokuSolve[t][i] == 0) {
				sb.append(DokuCopy[t][i]);
				D40.setText(sb.toString());
				D40.setStyle(D40.getStyle() + "-fx-text-inner-color:green;");
			} else if(t == 4 && i == 4 && DokuSolve[t][i] == 0) {
				sb.append(DokuCopy[t][i]);
				D41.setText(sb.toString());
				D41.setStyle(D41.getStyle() + "-fx-text-inner-color:green;");
			} else if(t == 4 && i == 5 && DokuSolve[t][i] == 0) {
				sb.append(DokuCopy[t][i]);
				D42.setText(sb.toString());
				D42.setStyle(D42.getStyle() + "-fx-text-inner-color:green;");
			} else if(t == 4 && i == 6 && DokuSolve[t][i] == 0) {
				sb.append(DokuCopy[t][i]);
				D43.setText(sb.toString());
				D43.setStyle(D43.getStyle() + "-fx-text-inner-color:green;");
			} else if(t == 4 && i == 7 && DokuSolve[t][i] == 0) {
				sb.append(DokuCopy[t][i]);
				D44.setText(sb.toString());
				D44.setStyle(D44.getStyle() + "-fx-text-inner-color:green;");
			} else if(t == 4 && i == 8 && DokuSolve[t][i] == 0) {
				sb.append(DokuCopy[t][i]);
				D45.setText(sb.toString());
				D45.setStyle(D45.getStyle() + "-fx-text-inner-color:green;");
			} else if(t == 5 && i == 0 && DokuSolve[t][i] == 0) {
				sb.append(DokuCopy[t][i]);
				D46.setText(sb.toString());
				D46.setStyle(D46.getStyle() + "-fx-text-inner-color:green;");
			} else if(t == 5 && i == 1 && DokuSolve[t][i] == 0) {
				sb.append(DokuCopy[t][i]);
				D47.setText(sb.toString());
				D47.setStyle(D47.getStyle() + "-fx-text-inner-color:green;");
			} else if(t == 5 && i == 2 && DokuSolve[t][i] == 0) {
				sb.append(DokuCopy[t][i]);
				D48.setText(sb.toString());
				D48.setStyle(D48.getStyle() + "-fx-text-inner-color:green;");
			} else if(t == 5 && i == 3 && DokuSolve[t][i] == 0) {
				sb.append(DokuCopy[t][i]);
				D49.setText(sb.toString());
				D49.setStyle(D49.getStyle() + "-fx-text-inner-color:green;");
			} else if(t == 5 && i == 4 && DokuSolve[t][i] == 0) {
				sb.append(DokuCopy[t][i]);
				D50.setText(sb.toString());
				D50.setStyle(D50.getStyle() + "-fx-text-inner-color:green;");
			} else if(t == 5 && i == 5 && DokuSolve[t][i] == 0) {
				sb.append(DokuCopy[t][i]);
				D51.setText(sb.toString());
				D51.setStyle(D51.getStyle() + "-fx-text-inner-color:green;");
			} else if(t == 5 && i == 6 && DokuSolve[t][i] == 0) {
				sb.append(DokuCopy[t][i]);
				D52.setText(sb.toString());
				D52.setStyle(D52.getStyle() + "-fx-text-inner-color:green;");
			} else if(t == 5 && i == 7 && DokuSolve[t][i] == 0) {
				sb.append(DokuCopy[t][i]);
				D53.setText(sb.toString());
				D53.setStyle(D53.getStyle() + "-fx-text-inner-color:green;");
			} else if(t == 5 && i == 8 && DokuSolve[t][i] == 0) {
				sb.append(DokuCopy[t][i]);
				D54.setText(sb.toString());
				D54.setStyle(D54.getStyle() + "-fx-text-inner-color:green;");
			} else if(t == 6 && i == 0 && DokuSolve[t][i] == 0) {
				sb.append(DokuCopy[t][i]);
				D55.setText(sb.toString());
				D55.setStyle(D55.getStyle() + "-fx-text-inner-color:green;");
			} else if(t == 6 && i == 1 && DokuSolve[t][i] == 0) {
				sb.append(DokuCopy[t][i]);
				D56.setText(sb.toString());
				D56.setStyle(D56.getStyle() + "-fx-text-inner-color:green;");
			} else if(t == 6 && i == 2 && DokuSolve[t][i] == 0) {
				sb.append(DokuCopy[t][i]);
				D57.setText(sb.toString());
				D57.setStyle(D57.getStyle() + "-fx-text-inner-color:green;");
			} else if(t == 6 && i == 3 && DokuSolve[t][i] == 0) {
				sb.append(DokuCopy[t][i]);
				D58.setText(sb.toString());
				D58.setStyle(D58.getStyle() + "-fx-text-inner-color:green;");
			} else if(t == 6 && i == 4 && DokuSolve[t][i] == 0) {
				sb.append(DokuCopy[t][i]);
				D59.setText(sb.toString());
				D59.setStyle(D59.getStyle() + "-fx-text-inner-color:green;");
			} else if(t == 6 && i == 5 && DokuSolve[t][i] == 0) {
				sb.append(DokuCopy[t][i]);
				D60.setText(sb.toString());
				D60.setStyle(D60.getStyle() + "-fx-text-inner-color:green;");
			} else if(t == 6 && i == 6 && DokuSolve[t][i] == 0) {
				sb.append(DokuCopy[t][i]);
				D61.setText(sb.toString());
				D61.setStyle(D61.getStyle() + "-fx-text-inner-color:green;");
			} else if(t == 6 && i == 7 && DokuSolve[t][i] == 0) {
				sb.append(DokuCopy[t][i]);
				D62.setText(sb.toString());
				D62.setStyle(D62.getStyle() + "-fx-text-inner-color:green;");
			} else if(t == 6 && i == 8 && DokuSolve[t][i] == 0) {
				sb.append(DokuCopy[t][i]);
				D63.setText(sb.toString());
				D63.setStyle(D63.getStyle() + "-fx-text-inner-color:green;");
			} else if(t == 7 && i == 0 && DokuSolve[t][i] == 0) {
				sb.append(DokuCopy[t][i]);
				D64.setText(sb.toString());
				D64.setStyle(D64.getStyle() + "-fx-text-inner-color:green;");
			} else if(t == 7 && i == 1 && DokuSolve[t][i] == 0) {
				sb.append(DokuCopy[t][i]);
				D65.setText(sb.toString());
				D65.setStyle(D65.getStyle() + "-fx-text-inner-color:green;");
			} else if(t == 7 && i == 2 && DokuSolve[t][i] == 0) {
				sb.append(DokuCopy[t][i]);
				D66.setText(sb.toString());
				D66.setStyle(D66.getStyle() + "-fx-text-inner-color:green;");
			} else if(t == 7 && i == 3 && DokuSolve[t][i] == 0) {
				sb.append(DokuCopy[t][i]);
				D67.setText(sb.toString());
				D67.setStyle(D67.getStyle() + "-fx-text-inner-color:green;");
			} else if(t == 7 && i == 4 && DokuSolve[t][i] == 0) {
				sb.append(DokuCopy[t][i]);
				D68.setText(sb.toString());
				D68.setStyle(D68.getStyle() + "-fx-text-inner-color:green;");
			} else if(t == 7 && i == 5 && DokuSolve[t][i] == 0) {
				sb.append(DokuCopy[t][i]);
				D69.setText(sb.toString());
				D69.setStyle(D69.getStyle() + "-fx-text-inner-color:green;");
			} else if(t == 7 && i == 6 && DokuSolve[t][i] == 0) {
				sb.append(DokuCopy[t][i]);
				D70.setText(sb.toString());
				D70.setStyle(D70.getStyle() + "-fx-text-inner-color:green;");
			} else if(t == 7 && i == 7 && DokuSolve[t][i] == 0) {
				sb.append(DokuCopy[t][i]);
				D71.setText(sb.toString());
				D71.setStyle(D71.getStyle() + "-fx-text-inner-color:green;");
			} else if(t == 7 && i == 8 && DokuSolve[t][i] == 0) {
				sb.append(DokuCopy[t][i]);
				D72.setText(sb.toString());
				D72.setStyle(D72.getStyle() + "-fx-text-inner-color:green;");
			} else if(t == 8 && i == 0 && DokuSolve[t][i] == 0) {
				sb.append(DokuCopy[t][i]);
				D73.setText(sb.toString());
				D73.setStyle(D73.getStyle() + "-fx-text-inner-color:green;");
			} else if(t == 8 && i == 1 && DokuSolve[t][i] == 0) {
				sb.append(DokuCopy[t][i]);
				D74.setText(sb.toString());
				D74.setStyle(D74.getStyle() + "-fx-text-inner-color:green;");
			} else if(t == 8 && i == 2 && DokuSolve[t][i] == 0) {
				sb.append(DokuCopy[t][i]);
				D75.setText(sb.toString());
				D75.setStyle(D75.getStyle() + "-fx-text-inner-color:green;");
			} else if(t == 8 && i == 3 && DokuSolve[t][i] == 0) {
				sb.append(DokuCopy[t][i]);
				D76.setText(sb.toString());
				D76.setStyle(D76.getStyle() + "-fx-text-inner-color:green;");
			} else if(t == 8 && i == 4 && DokuSolve[t][i] == 0) {
				sb.append(DokuCopy[t][i]);
				D77.setText(sb.toString());
				D77.setStyle(D77.getStyle() + "-fx-text-inner-color:green;");
			} else if(t == 8 && i == 5 && DokuSolve[t][i] == 0) {
				sb.append(DokuCopy[t][i]);
				D78.setText(sb.toString());
				D78.setStyle(D78.getStyle() + "-fx-text-inner-color:green;");
			} else if(t == 8 && i == 6 && DokuSolve[t][i] == 0) {
				sb.append(DokuCopy[t][i]);
				D79.setText(sb.toString());
				D79.setStyle(D79.getStyle() + "-fx-text-inner-color:green;");
			} else if(t == 8 && i == 7 && DokuSolve[t][i] == 0) {
				sb.append(DokuCopy[t][i]);
				D80.setText(sb.toString());
				D80.setStyle(D80.getStyle() + "-fx-text-inner-color:green;");
			} else if(t == 8 && i == 8 && DokuSolve[t][i] == 0) {
				sb.append(DokuCopy[t][i]);
				D81.setText(sb.toString());
				D81.setStyle(D81.getStyle() + "-fx-text-inner-color:green;");
			}
		}
  	}
	
	public void howlong() {
		int TimeSec = 0;
		String time;
		elapsedTimeMillis = System.currentTimeMillis()-start;
		elapsedTimeSec = elapsedTimeMillis/1000F;
		if(elapsedTimeSec > 59) {
			elapsedTimeMinutes = (int) (elapsedTimeSec / 60);
			TimeSec = (int) (elapsedTimeSec % 60);
			sb.append(elapsedTimeMinutes);
			sb.append(" Minutes ");
			sb.append(TimeSec);
			sb.append(" Seconds ");
			time = "completion time: " + sb.toString();
			} else if (elapsedTimeMillis > 999) {
				sb.append((int)elapsedTimeSec);
				sb.append(" Seconds");
				time = "completion time: " + sb.toString();
			} else {
				sb.append(elapsedTimeMillis);
				sb.append(" Milliseconds");
				time = "completion time: " + sb.toString();
			}
		timelabel.setText(time);
		sb.delete(0, 100);
	}
	public void resetbut() {
		minimum = 0;
		last = 0;
		dokulast = 0;
		timesbacked = 0;
		goback = 1;
		NotSolved = true;
		invoer = true;
		
		D1.setEditable(true);
		D1.setText("");
		D1.setStyle(D1.getStyle() + "-fx-text-inner-color:black;");
		D2.setEditable(true);
		D2.setText("");
		D2.setStyle(D2.getStyle() + "-fx-text-inner-color:black;");
		D3.setEditable(true);
		D3.setText("");
		D3.setStyle(D3.getStyle() + "-fx-text-inner-color:black;");
		D4.setEditable(true);
		D4.setText("");
		D4.setStyle(D4.getStyle() + "-fx-text-inner-color:black;");
		D5.setEditable(true);
		D5.setText("");
		D5.setStyle(D5.getStyle() + "-fx-text-inner-color:black;");
		D6.setEditable(true);
		D6.setText("");
		D6.setStyle(D6.getStyle() + "-fx-text-inner-color:black;");
		D7.setEditable(true);
		D7.setText("");
		D7.setStyle(D7.getStyle() + "-fx-text-inner-color:black;");
		D8.setEditable(true);
		D8.setText("");
		D8.setStyle(D8.getStyle() + "-fx-text-inner-color:black;");
		D9.setEditable(true);
		D9.setText("");
		D9.setStyle(D9.getStyle() + "-fx-text-inner-color:black;");
		D10.setEditable(true);
		D10.setText("");
		D10.setStyle(D10.getStyle() + "-fx-text-inner-color:black;");
		D11.setEditable(true);
		D11.setText("");
		D11.setStyle(D11.getStyle() + "-fx-text-inner-color:black;");
		D12.setEditable(true);
		D12.setText("");
		D12.setStyle(D12.getStyle() + "-fx-text-inner-color:black;");
		D13.setEditable(true);
		D13.setText("");
		D13.setStyle(D13.getStyle() + "-fx-text-inner-color:black;");
		D14.setEditable(true);
		D14.setText("");
		D14.setStyle(D14.getStyle() + "-fx-text-inner-color:black;");
		D15.setEditable(true);
		D15.setText("");
		D15.setStyle(D15.getStyle() + "-fx-text-inner-color:black;");
		D16.setEditable(true);
		D16.setText("");
		D16.setStyle(D16.getStyle() + "-fx-text-inner-color:black;");
		D17.setEditable(true);
		D17.setText("");
		D17.setStyle(D17.getStyle() + "-fx-text-inner-color:black;");
		D18.setEditable(true);
		D18.setText("");
		D18.setStyle(D18.getStyle() + "-fx-text-inner-color:black;");
		D19.setEditable(true);
		D19.setText("");
		D19.setStyle(D19.getStyle() + "-fx-text-inner-color:black;");
		D20.setEditable(true);
		D20.setText("");
		D20.setStyle(D20.getStyle() + "-fx-text-inner-color:black;");
		D21.setEditable(true);
		D21.setText("");
		D21.setStyle(D21.getStyle() + "-fx-text-inner-color:black;");
		D22.setEditable(true);
		D22.setText("");
		D22.setStyle(D22.getStyle() + "-fx-text-inner-color:black;");
		D23.setEditable(true);
		D23.setText("");
		D23.setStyle(D23.getStyle() + "-fx-text-inner-color:black;");
		D24.setEditable(true);
		D24.setText("");
		D24.setStyle(D24.getStyle() + "-fx-text-inner-color:black;");
		D25.setEditable(true);
		D25.setText("");
		D25.setStyle(D25.getStyle() + "-fx-text-inner-color:black;");
		D26.setEditable(true);
		D26.setText("");
		D26.setStyle(D26.getStyle() + "-fx-text-inner-color:black;");
		D27.setEditable(true);
		D27.setText("");
		D27.setStyle(D27.getStyle() + "-fx-text-inner-color:black;");
		D28.setEditable(true);
		D28.setText("");
		D28.setStyle(D28.getStyle() + "-fx-text-inner-color:black;");
		D29.setEditable(true);
		D29.setText("");
		D29.setStyle(D29.getStyle() + "-fx-text-inner-color:black;");
		D30.setEditable(true);
		D30.setText("");
		D30.setStyle(D30.getStyle() + "-fx-text-inner-color:black;");
		D31.setEditable(true);
		D31.setText("");
		D31.setStyle(D31.getStyle() + "-fx-text-inner-color:black;");
		D32.setEditable(true);
		D32.setText("");
		D32.setStyle(D32.getStyle() + "-fx-text-inner-color:black;");
		D33.setEditable(true);
		D33.setText("");
		D33.setStyle(D33.getStyle() + "-fx-text-inner-color:black;");
		D34.setEditable(true);
		D34.setText("");
		D34.setStyle(D34.getStyle() + "-fx-text-inner-color:black;");
		D35.setEditable(true);
		D35.setText("");
		D35.setStyle(D35.getStyle() + "-fx-text-inner-color:black;");
		D36.setEditable(true);
		D36.setText("");
		D36.setStyle(D36.getStyle() + "-fx-text-inner-color:black;");
		D37.setEditable(true);
		D37.setText("");
		D37.setStyle(D37.getStyle() + "-fx-text-inner-color:black;");
		D38.setEditable(true);
		D38.setText("");
		D38.setStyle(D38.getStyle() + "-fx-text-inner-color:black;");
		D39.setEditable(true);
		D39.setText("");
		D39.setStyle(D39.getStyle() + "-fx-text-inner-color:black;");
		D40.setEditable(true);
		D40.setText("");
		D40.setStyle(D40.getStyle() + "-fx-text-inner-color:black;");
		D41.setEditable(true);
		D41.setText("");
		D41.setStyle(D41.getStyle() + "-fx-text-inner-color:black;");
		D42.setEditable(true);
		D42.setText("");
		D42.setStyle(D42.getStyle() + "-fx-text-inner-color:black;");
		D43.setEditable(true);
		D43.setText("");
		D43.setStyle(D43.getStyle() + "-fx-text-inner-color:black;");
		D44.setEditable(true);
		D44.setText("");
		D44.setStyle(D44.getStyle() + "-fx-text-inner-color:black;");
		D45.setEditable(true);
		D45.setText("");
		D45.setStyle(D45.getStyle() + "-fx-text-inner-color:black;");
		D46.setEditable(true);
		D46.setText("");
		D46.setStyle(D46.getStyle() + "-fx-text-inner-color:black;");
		D47.setEditable(true);
		D47.setText("");
		D47.setStyle(D47.getStyle() + "-fx-text-inner-color:black;");
		D48.setEditable(true);
		D48.setText("");
		D48.setStyle(D48.getStyle() + "-fx-text-inner-color:black;");
		D49.setEditable(true);
		D49.setText("");
		D49.setStyle(D49.getStyle() + "-fx-text-inner-color:black;");
		D50.setEditable(true);
		D50.setText("");
		D50.setStyle(D50.getStyle() + "-fx-text-inner-color:black;");
		D51.setEditable(true);
		D51.setText("");
		D51.setStyle(D51.getStyle() + "-fx-text-inner-color:black;");
		D52.setEditable(true);
		D52.setText("");
		D52.setStyle(D52.getStyle() + "-fx-text-inner-color:black;");
		D53.setEditable(true);
		D53.setText("");
		D53.setStyle(D53.getStyle() + "-fx-text-inner-color:black;");
		D54.setEditable(true);
		D54.setText("");
		D54.setStyle(D54.getStyle() + "-fx-text-inner-color:black;");
		D55.setEditable(true);
		D55.setText("");
		D55.setStyle(D55.getStyle() + "-fx-text-inner-color:black;");
		D56.setEditable(true);
		D56.setText("");
		D56.setStyle(D56.getStyle() + "-fx-text-inner-color:black;");
		D57.setEditable(true);
		D57.setText("");
		D57.setStyle(D57.getStyle() + "-fx-text-inner-color:black;");
		D58.setEditable(true);
		D58.setText("");
		D58.setStyle(D58.getStyle() + "-fx-text-inner-color:black;");
		D59.setEditable(true);
		D59.setText("");
		D59.setStyle(D59.getStyle() + "-fx-text-inner-color:black;");
		D60.setEditable(true);
		D60.setText("");
		D60.setStyle(D60.getStyle() + "-fx-text-inner-color:black;");
		D61.setEditable(true);
		D61.setText("");
		D61.setStyle(D61.getStyle() + "-fx-text-inner-color:black;");
		D62.setEditable(true);
		D62.setText("");
		D62.setStyle(D62.getStyle() + "-fx-text-inner-color:black;");
		D63.setEditable(true);
		D63.setText("");
		D63.setStyle(D63.getStyle() + "-fx-text-inner-color:black;");
		D64.setEditable(true);
		D64.setText("");
		D64.setStyle(D64.getStyle() + "-fx-text-inner-color:black;");
		D65.setEditable(true);
		D65.setText("");
		D65.setStyle(D65.getStyle() + "-fx-text-inner-color:black;");
		D66.setEditable(true);
		D66.setText("");
		D66.setStyle(D66.getStyle() + "-fx-text-inner-color:black;");
		D67.setEditable(true);
		D67.setText("");
		D67.setStyle(D67.getStyle() + "-fx-text-inner-color:black;");
		D68.setEditable(true);
		D68.setText("");
		D68.setStyle(D68.getStyle() + "-fx-text-inner-color:black;");
		D69.setEditable(true);
		D69.setText("");
		D69.setStyle(D69.getStyle() + "-fx-text-inner-color:black;");
		D70.setEditable(true);
		D70.setText("");
		D70.setStyle(D70.getStyle() + "-fx-text-inner-color:black;");
		D71.setEditable(true);
		D71.setText("");
		D71.setStyle(D71.getStyle() + "-fx-text-inner-color:black;");
		D72.setEditable(true);
		D72.setText("");
		D72.setStyle(D72.getStyle() + "-fx-text-inner-color:black;");
		D73.setEditable(true);
		D73.setText("");
		D73.setStyle(D73.getStyle() + "-fx-text-inner-color:black;");
		D74.setEditable(true);
		D74.setText("");
		D74.setStyle(D74.getStyle() + "-fx-text-inner-color:black;");
		D75.setEditable(true);
		D75.setText("");
		D75.setStyle(D75.getStyle() + "-fx-text-inner-color:black;");
		D76.setEditable(true);
		D76.setText("");
		D76.setStyle(D76.getStyle() + "-fx-text-inner-color:black;");
		D77.setEditable(true);
		D77.setText("");
		D77.setStyle(D77.getStyle() + "-fx-text-inner-color:black;");
		D78.setEditable(true);
		D78.setText("");
		D78.setStyle(D78.getStyle() + "-fx-text-inner-color:black;");
		D79.setEditable(true);
		D79.setText("");
		D79.setStyle(D79.getStyle() + "-fx-text-inner-color:black;");
		D80.setEditable(true);
		D80.setText("");
		D80.setStyle(D80.getStyle() + "-fx-text-inner-color:black;");
		D81.setEditable(true);
		D81.setText("");
		D81.setStyle(D81.getStyle() + "-fx-text-inner-color:black;");
		
		Brutedoku.setText("BruteDoku");
		timelabel.setText("");
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}

