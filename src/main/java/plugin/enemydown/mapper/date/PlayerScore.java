package plugin.enemydown.mapper.date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * プレイヤーのスコア情報を扱うオブジェト＼。
 * DBに存在するテーブルと連動する。
 */

@Getter
@Setter
@NoArgsConstructor
public class PlayerScore {
    private int id;
    private String playerName;
    private int score;
    private String difficulty;
    private LocalDateTime registeredAt;

    public PlayerScore (String playerName, int score, String difficulty) {
        this.playerName = playerName;
        this.score = score;
        this.difficulty = difficulty;
    }
}
