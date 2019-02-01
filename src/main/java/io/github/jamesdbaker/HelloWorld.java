package io.github.jamesdbaker;

/**
 * A friendly class that will say hello to everyone!
 */
public class HelloWorld {
  public static void main(String[] args){
    System.out.println("Hello "+getName(args)+"!");
  }

  protected static String getName(String[] args){
    if(args.length == 0){
      return "world";
    }else{
      return args[0];
    }
  }
}
