package ies.dam.collumns;

import ies.dam.collumns.utils.Resources;
import ies.dam.collumns.interfaces.IDebuggable;
import String;
import ies.dam.collumns.interfaces.IDrawable;

public class Jewel extends IDebuggable, IDrawable, Resources {

  private JewelType type;

  private boolean isdebug;

  private int row;

  private int column;

  public void Jewel(JewelType type, int row, int column) {
  }

  public void Jewel() {
  }

  public void paint(GraphicsContext gc) {
  }

  public void moveLeft(Board b) {
  }

  public void moveRight(Board b) {
  }

  public void moveDown(Board b) {
  }

  public void moveUp(Board b) {
  }

  public int getRow() {
  return 0;
  }

  public int getColumn() {
  return 0;
  }

  public JewelType getType() {
  return null;
  }

  public void setType(JewelType type) {
  }

  public String toString() {
  return null;
  }

  public void setDebug(boolean value) {
  }

  public boolean isDebug() {
  return false;
  }

  public void debug(GraphicsContext gc) {
  }

  public void Jewel(JewelType type) {
  }

}