package domain;

import java.io.PrintStream;

public class TestDemo {
    //对歌曲类Song进行测试
    public void testSong() {
        Song song1 = new Song("s001", "外婆的澎湖湾", "外婆");
        Song song2 = new Song("s002", "黄昏", "老黄");

        Song song3 = new Song("s003", "爱笑的眼睛", "林俊杰");
        Song song4 = new Song("s003", "爱笑的眼睛", "林俊杰");
        System.out.println(song1.equals(song2));
        System.out.println(song3.equals(song4));
        System.out.println(song3.hashCode());
        System.out.println(song4.hashCode());
        System.out.println(song1);


        


    }

    //对播放列表类PlayList进行测试
    public void testPlayList() {
        Song song1 = new Song("s001", "外婆的澎湖湾", "外婆");
        Song song2 = new Song("s002", "黄昏", "老黄");
        Song song3 = new Song("s003", "爱笑的眼睛", "林俊杰");
        Song song4 = new Song("s003", "爱笑的眼睛", "林俊杰");

        PlayList mainPlayList = new PlayList("怀旧歌曲");
        mainPlayList.addToPlayList(song1);
        mainPlayList.addToPlayList(song2);
        mainPlayList.addToPlayList(song3);
        mainPlayList.addToPlayList(song4);
        mainPlayList.displayAllSong();

        //测试 通过id或者名字进行查询
        Song song = mainPlayList.searchSongById("s002");
        if (song != null) {
            System.out.println("查找成功，信息为");
            System.out.println(song);
        } else {
            System.out.println("该歌曲不存在");
        }

        Song songUpdate = new Song("s005","春天在哪里","hwy");
        mainPlayList.upDateSong("s003",songUpdate);
        mainPlayList.displayAllSong();
        mainPlayList.deleteSong("s002");
        mainPlayList.displayAllSong();





    }




    public static void main(String[] args) {
        TestDemo testDemo = new TestDemo();
//        testDemo.testSong();
       testDemo.testPlayList();


    }

}
