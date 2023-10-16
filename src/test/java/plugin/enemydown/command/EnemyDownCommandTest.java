package plugin.enemydown.command;

import org.bukkit.entity.Player;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import plugin.enemydown.Main;

import static org.junit.jupiter.api.Assertions.*;

class EnemyDownCommandTest {
    EnemyDownCommand sut;

    @BeforeEach
    void before() {
        sut = new EnemyDownCommand(main);
    }

    @Mock
    Main main;

    @Mock
    Player player;

    @Test
    void getDifficultyに渡す引数のargsの最初の文字列がeasyの時にeasyの文字列が返ること() {
        String actual = sut.getDifficulty(player, new String[]{"easy"});
        Assertions.assertEquals("easy", actual);
    }

    @Test
    void getDifficultyに渡す引数のargsの最初の文字列がnormalの時にnormalの文字列が返ること() {
        String actual = sut.getDifficulty(player, new String[]{"normal"});
        Assertions.assertEquals("normal", actual);
    }

    @Test
    void getDifficultyに渡す引数のargsの最初の文字列がhardの時にhardの文字列が返ること() {
        String actual = sut.getDifficulty(player, new String[]{"hard"});
        Assertions.assertEquals("hard", actual);
    }
}