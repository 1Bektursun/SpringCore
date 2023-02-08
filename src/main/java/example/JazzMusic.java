package example;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class JazzMusic implements Music{
    @Override
    public String getSong(){
        return "Smooth Piano";
    }
}
