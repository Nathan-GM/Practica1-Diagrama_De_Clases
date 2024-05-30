package ies.dam.collumns.utils;

import ies.dam.collumns.interfaces.IWarnClock;
import ies.dam.collumns.int;
import ies.dam.collumns.enum;

public class Clock extends IWarnClock {

  private int frecuency;

  private float delta;

  private long time;

  private Thread t;

  private ArrayList<IWarnClock> observers;

  public enum ClockState;

  private ClockState ClockState;

  public void Clock(int frecuency) {
  }

  public void setFrecuency(int frecuency) {
  }

  public int getFrecuency() {
  return 0;
  }

  public void incFrecuency() {
  }

  public void decFrecuency() {
  }

  public void addIWarClock(int index) {
  }

  private void update() {
  }

  public void start() {
  }

  public void stop() {
  }

  public void close() {
  }

  public ClockState state() {
  return null;
  }

  public void run() {
  }

  public float getDelta() {
  return 0.0;
  }

}