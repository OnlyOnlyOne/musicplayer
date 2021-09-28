package domain;

import java.util.*;


/**
 * The type Play list.
 */
public class PlayList {
    private String playListName;//播放列表的名称
    private List<Song> musicList;//播放列表中的歌曲集合

    /**
     * Instantiates a new Play list.
     *
     * @param playListName the play list name
     */
    public PlayList(String playListName) {
        this.playListName = playListName;
        musicList = new ArrayList<Song>();
    }

    /**
     * Add to play list.
     *
     * @param song the song
     */
    public void addToPlayList(Song song) {
        //要排除重复添加的情况
        boolean flag = false;
        //增强型for循环
        for (Song s : musicList) {
            if (s.equals(song)) {
                flag = true;
                break;
            }
        }
        if (!flag) {
            musicList.add(song);
        } else {
            System.out.println("该歌曲已经存在于播放列表中");
        }

    }


    /**
     * Search song by id song.
     *
     * @param id the id
     * @return the song
     */
    public Song searchSongById(String id) {
        Song song = null;
        //id是唯一的
        for (Song song1 : musicList) {
            if (song1.getId().equals(id)) {
                song = song1;break;
            }
        }
        return song;
    }

    /**
     * Search song by name song.
     *
     * @param name 歌曲名称
     * @return 返回歌曲的信息
     */
    public Song searchSongByName(String name) {
        Song song = null;

        for (Song song1 : musicList) {
            if (song1.getName().equals(name)) {
                song = song1;break;
            }
        }
        return null;
    }

    //删除指定的歌曲
    public void deleteSong(String id) {
        Song song2 = searchSongById(id);
        if (song2 != null) {
            musicList.remove(song2);
        } else {
            System.out.println("没有该歌曲");
        }
    }

    //修改歌曲信息
    public void upDateSong(String id, Song song) {
        //根据id查询到相关的信息，再修改

       Song song1 = searchSongById(id);
        if (song1 != null) {
            musicList.remove(song1);
            musicList.add(song);
            System.out.println("修改成功");
        } else {
            System.out.println("没有找到id为" + id + "对应的歌曲信息");
        }

    }


    /**
     * Display all song.
     */
    public void displayAllSong() {
        System.out.println("播放列表的所有歌曲为");
        for (Song song1 : musicList) {
            System.out.println(song1);
        }
    }

}
