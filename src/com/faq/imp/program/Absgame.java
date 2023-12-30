package com.faq.imp.program;

abstract class Gamep {
	  abstract void play();
	  }
	  class Pubg extends Gamep {
	  void play () {
	  System.out.println("Multi-user playing PUBG game with internet connectivity");
	  }}
	  
	  class Absgame {
	  public static void main (String arg []) {
	  Gamep obj = new Pubg();
	  obj.play();
	  }}