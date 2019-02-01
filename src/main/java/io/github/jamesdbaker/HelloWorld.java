package io.github.jamesdbaker;

/**
 * A friendly class that will say hello to everyone!
 */
public class HelloWorld {
  public static void main(String[] args){
    System.out.println(getGreeting()+" "+getName(args)+"!");
  }

  protected static String getName(String[] args){
    if(args.length == 0){
      return "world";
    }else{
      return args[0];
    }
  }

  protected static String getGreeting(){
    long option = System.currentTimeMillis() % 3;

    if(option == 0){
      return "Hello";
    }else if(option == 1){
      return "Hey";
    }else{
      return "G'day";
    }
  }
}
