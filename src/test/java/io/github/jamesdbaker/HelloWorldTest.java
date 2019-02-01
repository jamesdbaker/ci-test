package io.github.jamesdbaker;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class HelloWorldTest {
  @Test
  public void testGetName(){
    assertEquals("world", HelloWorld.getName(new String[]{}));
    assertEquals("James", HelloWorld.getName(new String[]{"James"}));
    assertEquals("James", HelloWorld.getName(new String[]{"James", "Jane"}));
  }
}
