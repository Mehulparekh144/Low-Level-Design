package flyweight.with;

import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {
  private static Map<java.lang.Character,Character> cache = new HashMap<>();

  public static Character create(char character){
    return cache.computeIfAbsent(character, c -> new DocumentCharacter(c , "Arial" , 20));
  }
}
