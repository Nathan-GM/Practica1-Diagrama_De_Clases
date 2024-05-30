package ies.dam.collumns;

import ies.dam.collumns.interfaces.IDrawable;

public class Board extends IDrawable {

  public int COLUMNS;

  public int ROWS;

  public int OFFSETX;

  public int OFFSETY;

  private Jewel matrix;

  public void Board() {
  }

  public void Board(Jewel[][] matrix) {
  }

  private int getMinRow(int col) {
  return 0;
  }

  public boolean isEmpty(int row, int col) {
  return false;
  }

  public boolean collision(Column c) {
  return false;
  }

  public void evaluate() {
  }

  private boolean recolocate() {
  return false;
  }

  private void removeJewels(ArrayList<Jewel> jewels) {
  }

  private ArrayList<Jewel> eval_horizontal(int row, int col) {
  return null;
  }

  private ArrayList<Jewel> eval_vertical(int row, int col) {
  return null;
  }

  private ArrayList<Jewel> eval_diagonal_derecha(int row, int col) {
  return null;
  }

  public ArrayList<Jewel> eval_diagonal_izquierda(int row, int col) {
  return null;
  }

  public void paint(GraphicsContext gc) {
  }

}