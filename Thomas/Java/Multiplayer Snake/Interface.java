package sneakysnake;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Interface extends Application {
	private ArrayList<Rectangle> snake = new ArrayList<Rectangle>();
	private char coll;
	private int head;
	private boolean dorand = false;
	private boolean endgame = false;
	private boolean online = false;
	private Rectangle oldHead;
	private Rectangle headSnac;
	private String direction = "W";
	private boolean newCube = true;
	private int pCount = 0;
	private Timeline MoveSnac;
	private Rectangle food;
	private Rectangle pow;
	private String trueD = "W";
	private boolean doAgain;
	private String data;
	private boolean gotD = false;
	private double multiplier = 4;
	
	public void start(Stage arg0) throws Exception {
		final int Width = 511;
		final int Height = 511;
		
		BorderPane layout = new BorderPane();
		Pane playField = new Pane();
		
		layout.setCenter(playField);
		
		Stage primaryStage = new Stage();
		primaryStage.setTitle("Snake 1.0");
		primaryStage.setScene(new Scene(layout, Width, Height));
		primaryStage.setResizable(false);
		primaryStage.show();
		Game(primaryStage, playField, layout);
	}
	
	private void Game(Stage stage,Pane field,BorderPane layout) {
		Rectangle osnac = getBlock(8,8);
		field.getChildren().addAll(osnac);
		osnac.setVisible(false);
				
		Thread Networking = new Thread() {
			public void run() {
				client c = new client();
				while(!online) {
					try {
						online = c.Start();
					} catch (IOException e1) {
						online = false;
						e1.printStackTrace();
					}
				}
				osnac.setVisible(true);
				while(online) {
					System.out.print("");
					if(!gotD) {
						try {
							System.out.print("");
							data = c.recieve();
						} catch (IOException e) {
							e.printStackTrace();
						}
						gotD = true;
					}
				}
			}
		};
		
		Networking.setDaemon(true);
		Networking.start();
		
		Timeline HandleD = new Timeline(
			new KeyFrame(Duration.millis(10), event ->{
				if(gotD) {
					gotD = false;
					String D[];
					D = data.split("-");
					try {
						double OX = Double.parseDouble(D[0]);
						double OY = Double.parseDouble(D[1]);
						//System.out.println("X:" + OX + " Y:" + OY);
						osnac.setX(OX);
						osnac.setY(OY);
					} catch(NumberFormatException e) {
						e.printStackTrace();
					}
				}
			})
		);
		
		HandleD.setCycleCount(Animation.INDEFINITE);
		HandleD.play();
		
		Rectangle start = getBlock(8, 8);
		snake.add(start);
		pCount++;
		field.getChildren().addAll(start);
		
		MoveSnac = new Timeline(
            new KeyFrame(Duration.millis(400), event -> {
				if(newCube) {
					if(multiplier > 0.15) {
						multiplier =multiplier - 0.15;
					}
					newCube = false;
					Rectangle newBlock = getBlock(8, 8);
					snake.add(newBlock);
					pCount++;
					double XL;
					double YL;
					food = spawnfood();
					boolean issnac = false;
					do {
						XL = getLoc(513, true);
						YL = getLoc(513, true);
						for(int i = 0; i < snake.size(); i++) {
							char check = checkBounds(snake.get(i), food, pow, field);
							if(check == 'G') {
								issnac = true;
							}
						}
					} while(issnac);
					
					field.getChildren().addAll(newBlock, food);
					
					food.setX(XL);
					food.setY(YL);
					
					oldHead = snake.get(head);
					head = snake.size() - 1;
					headSnac = snake.get(head);
					
					dorand = getrand(getLoc(101, false));
					
					if(dorand) {
						if(!field.getChildren().contains(pow)) {
							pow = getBlock(4, 4);
							pow.setFill(Color.BLUE);
							double XP;
							double YP;
							do {
								XP = getLoc(513, true);
								YP = getLoc(513, true);
								for(int i = 0; i < snake.size(); i++) {
									char check = checkBounds(snake.get(i), food, pow, field);
									if(check == 'P') {
										issnac = true;
									}
								}
							} while(XP == XL && YL == YP && !issnac);
							pow.setX(XP);
							pow.setY(YP);
							field.getChildren().addAll(pow);
						}
					}
					
					do {
						doAgain = false;
						
						if(direction.equals("W") && !trueD.equals("S")) {
							trueD = "W";
							newBlock.setY(oldHead.getY() - 9);
							newBlock.setX(oldHead.getX());
						} else if (direction.equals("S") && !trueD.equals("W")) {
							trueD = "S";
							newBlock.setY(oldHead.getY() + 9);
							newBlock.setX(oldHead.getX());
						} else if (direction.equals("A") && !trueD.equals("D")) {
							trueD = "A";
							newBlock.setX(oldHead.getX() - 9);
							newBlock.setY(oldHead.getY());
						} else if (direction.equals("D") && !trueD.equals("A")) {
							trueD = "D";
							newBlock.setX(oldHead.getX() + 9);
							newBlock.setY(oldHead.getY());
						} else {
							direction = trueD;
							doAgain = true;
						}
					} while(doAgain);
				}
				
				double oldX = headSnac.getX();
				double oldY = headSnac.getY();
				
				for(int i = 0; i < head ; i++) {
					double X = snake.get(i + 1).getX();
					double Y = snake.get(i + 1).getY();
					
						snake.get(i).setX(X);
						snake.get(i).setY(Y);
				}
				
				do {
					doAgain = false;
					
					if(direction.equals("W") && !trueD.equals("S")) {
						trueD = "W";
						headSnac.setY(oldY - 9);
					} else if (direction.equals("S") && !trueD.equals("W")) {
						trueD = "S";
						headSnac.setY(oldY + 9);
					} else if (direction.equals("A") && !trueD.equals("D")) {
						trueD = "A";
						headSnac.setX(oldX - 9);
					} else if (direction.equals("D") && !trueD.equals("A")) {
						trueD = "D";
						headSnac.setX(oldX + 9);
					} else {
						direction = trueD;
						doAgain = true;
					}
				}while(doAgain);
				
				char Bounds = checkBounds(headSnac, food, pow, field);
				
				new Thread() {
					public void run() {
						coll = checkColl(snake);
					
						if(coll == '1') {
							endgame = true;
						}
					}
				}.start();
				
				if(endgame) {
					field.getChildren().removeAll(snake);
					MoveSnac.stop();
				}
				
				
				if(Bounds == 'G') {
					newCube = true;
					field.getChildren().remove(food);
				} else if(Bounds == 'P') {
					multiplier = multiplier + 0.8;
					field.getChildren().remove(pow);
				}
				
				if(online) {
					client c = new client();
					try {
						c.send(headSnac.getX(), headSnac.getY());
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
				
				MoveSnac.setRate(multiplier);
			})
		);
		MoveSnac.setCycleCount(Animation.INDEFINITE);
		MoveSnac.play();
		
		stage.getScene().setOnKeyPressed(e ->{
			if(e.getCode() == KeyCode.W) {
				direction = "W";
			} else if (e.getCode() == KeyCode.S) {
				direction = "S";
			} else if (e.getCode() == KeyCode.A) {
				direction = "A";
			} else if (e.getCode() == KeyCode.D) {
				direction = "D";
			}
		});
	}
	
	private Rectangle spawnfood() {
		Rectangle food = new Rectangle();
		food.setFill(Color.RED);
		food.setHeight(4);
		food.setWidth(4);
		
		return food;
	}
	
	private double getLoc(int Max, boolean round) {
		Random r = new Random();
		
		double loc = (int)r.nextInt(Max);
		
		if(round) {
			while(loc % 4.5 != 0) {
				loc++;
			}
			
			loc += 2;
		}
		
		return (double)loc;
	}
	
	private Rectangle getBlock(int width,int height) {
		Rectangle block = new Rectangle();
		block.setHeight(height);
		block.setWidth(width);
		Color col;
		do {
			col = Color.rgb((int)getLoc(255, false), (int)getLoc(255, false), (int)getLoc(255, false), 1.0);
		}while(col == Color.WHITE);
		
		block.setFill(col);
		
		return block;
	}
	
	private char checkColl(ArrayList<Rectangle> snake) {
		char code = 'X';
		
		for(int i = 0; i < snake.size() - 1; i++) {
			if(snake.get(i).getX() == snake.get(snake.size() - 1).getX()) {
				if((snake.get(i).getY() == snake.get(snake.size() - 1).getY())) {
					code = '1';
				}
			}
		}
		return code;
	}
	
	private char checkBounds(Rectangle head, Rectangle Food, Rectangle power, Pane field) {
		char code = 'X';
		double X = head.getX();
		double Y = head.getY();
		
		if(X > 513) {
			code = '1';
			head.setX(0);
		} else if (X < 0) {
			code = '2';
			head.setX(513);
		} else if (Y > 513) {
			code = '3';
			head.setY(0);
		} else if (Y < 0) {
			code = '4';
			head.setY(513);
		} else if (X < Food.getX() && X + 8 > Food.getX()) {
			if (Y < Food.getY() && Y + 8 > Food.getY()) {
				code = 'G';
			}
		} else if(field.getChildren().contains(pow)) {
			if(X < power.getX() && X + 8 > power.getX()) {
				if (Y < power.getY() && Y + 8 > power.getY()) {
					code = 'P';
				}
			}
		}
		return code;
	}
	
	private boolean getrand(double rand) {
		if(rand > 60) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
