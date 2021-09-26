package user;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class User {

  @Builder.Default
  private String nome = "Bruno";

  @Builder.Default
  private String email = "bruno@gmail.com";

  @Builder.Default
  private Integer age = 31;

  @Override
  public String toString() {
    return "{\"nome\":" + nome + "," +
            "\"email\":" + email + "," +
            "\"age\":" + age + "}";
  }
}
