package ies.dam.collumns;

import ies.dam.collumns.utils.Resources;
import ies.dam.collumns.interfaces.IWarnClock;
import ies.dam.collumns.interfaces.IDebuggable;
import ies.dam.collumns.keyboard.KeyboardState;
import ies.dam.collumns.utils.Clock;
import ies.dam.collumns.keyboard.KeyBoard;
import ies.dam.collumns.interfaces.IKeyListener;

public class Game extends Clock, Resources, KeyboardState, KeyBoard, IWarnClock, IDebuggable, IKeyListener {

  public Clock clock;

  private Dimension2D original_size;

  private Board board;

  private GraphicsContext ctx;

  private GraphicsContext ctxbackground;

  private KeyBoard kb;

  private boolean debug;

  private Column column;

  private Column next;

  public int SCALE;

  public void Game(GraphicsContext context, GraphicsContext background, Dimension2D original) {
  }

  public void start() {
  }

  public void stop() {
  }

  public void TicTac() {
  }

  private void process_input() {
  }

  private void update() {
  }

  private void paint_next(GraphicsContext gc) {
  }

  private void render() {
  }

  public boolean isDebug() {
  return false;
  }

  public void setDebug(boolean debug) {
  }

  private void clear(GraphicsContext gc) {
  }

  private void paintbackground() {
  }

  public void onKeyPressed(KeyCode code) {
  }

  public void onKeyReleased(KeyCode code) {
  }

  public void debug(GraphicsContext gc) {
  }

}