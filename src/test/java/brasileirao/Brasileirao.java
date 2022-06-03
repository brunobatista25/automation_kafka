package brasileirao;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class Brasileirao {

    @Builder.Default
    private String nomeDoTimeDaCasa = "Bruno";

    @Builder.Default
    private String nomeDoTimeDeFora = "bruno@gmail.com";

    @Builder.Default
    private String resultado = "2 x 0";

    @Builder.Default
    private String timeVitorioso = "Fluminense";
    @Override
    public String toString() {
        return "{\"nomeDoTimeDaCasa\":" + nomeDoTimeDaCasa + "," +
                "\"nomeDoTimeDeFora\":" + nomeDoTimeDeFora + "," +
                "\"resultado\":" + resultado + "," +
                "\"timeVitorioso\":" + timeVitorioso + "}";
    }


}
