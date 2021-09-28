package domain;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * The type Play list collection.
 */
public class PlayListCollection {
    /**
     * The Play list map.
     */
//存放播放列表信息
    Map<String,PlayList> playListMap;

    /**
     * Instantiates a new Play list collection.
     *
     * @param playListMap the play list map
     */
    public PlayListCollection() {
        playListMap = new HashMap<String, PlayList>();
    }

    /**
     * Sets play list map.
     *
     * @param playListMap the play list map
     */
    public void setPlayListMap(Map<String, PlayList> playListMap) {
        this.playListMap = playListMap;
    }

    /**
     * Gets play list map.
     *
     * @return the play list map
     */
    public Map<String, PlayList> getPlayListMap() {
        return playListMap;
    }

    /**
     * Delete play list.
     *
     * @param playList the play list
     */
    public void deletePlayList(PlayList playList) {
        playListMap.remove(playList.getPlayListName());
        System.out.println("删除成功！");


    }

    /**
     * 通过播放列表得名称查询播放列表
     *
     * @param playListName the play list name
     * @return the play list
     */
    public PlayList searchPlayListbyName(String playListName) {
        PlayList playList = null;
        Set<String> keySet = playListMap.keySet();
        for (String key : keySet) {
            if (playListName.equals(key)) {
                playList = playListMap.get(key);
                break;
            }
        }
        return playList;
    }

    /**
     * Display all play list.
     * 显示所有播放列表
     */
    public void displayAllPlayList() {
        Iterator<PlayList> iterator = playListMap.values().iterator();
        System.out.println("播放列表的名称为");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }


    /**
     * //向集合中增加播放列表实例
     *
     * @param playList the play list
     */
    public void addPlayList(PlayList playList) {
        //播放列表名称称为key值
        playListMap.put(playList.getPlayListName(), playList);
    }
}
