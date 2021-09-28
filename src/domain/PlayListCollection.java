package domain;

import java.util.Map;

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
    public PlayListCollection(Map<String, PlayList> playListMap) {
        this.playListMap = playListMap;
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
     * //向集合中增加播放列表实例
     *
     * @param playList the play list
     */
    public void addPlayList(PlayList playList) {
        //播放列表名称称为key值
        playListMap.put(playList.getPlayListName(),playList);
    }
}
