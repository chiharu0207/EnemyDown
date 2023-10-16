package plugin.enemydown.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import plugin.enemydown.mapper.date.PlayerScore;

import java.util.List;

public interface PlayerScoreMapper {
    @Select("SELECT * FROM player_score")
    List<PlayerScore> selectList();

    @Insert("insert player_score(player_name, score, difficulty, registered_at) values(#{playerName}, #{score}, #{difficulty}, now())")
    int insert(PlayerScore playerScore);
}
