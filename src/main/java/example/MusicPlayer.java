package example;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@NoArgsConstructor
@Setter
@Getter
@ToString

public class MusicPlayer {
    private List<Music> musicList;

    private String name;

    private int volume;



}
