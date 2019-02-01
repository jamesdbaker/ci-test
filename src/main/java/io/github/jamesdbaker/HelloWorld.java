package io.github.jamesdbaker;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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
    List<String> greetings = Arrays.asList("Hello", "Howdy", "Hey", "G'day");
    Collections.shuffle(greetings);

    return greetings.get(0);
  }
}
