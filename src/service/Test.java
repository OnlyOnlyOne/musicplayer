package service;

import domain.PlayList;
import domain.PlayListCollection;
import domain.Song;
import view.MainMenu;
import view.PlayListMenu;
import view.PlayerMenu;

import java.util.Scanner;

public class Test {
    public void test() {
        MainMenu mainMenu = new MainMenu();
        //创建一个播放列表容器（播放器）
        PlayListCollection plc = new PlayListCollection();
        //创建主播放列表
        PlayList mainPlayList = new PlayList("主播放列表");
        //将主播放列表添加到播放器
        plc.addPlayList(mainPlayList);
        PlayList favouritePlayList = null;
//        PlayerMenu playerMenu = new PlayerMenu();
//        PlayListMenu playListMenu = new PlayListMenu();
        Scanner sc = new Scanner(System.in);
        int input = 0, input1 = 1, input2 = 2;

        while (true) {
            mainMenu.mainMent();
            System.out.println("请输入你的选择结果");
            int get = sc.nextInt();
            if (get == 0) {
                break;
            }
            switch (get) {
                case 1:
                    //播放列表的管理
                    PlayListMenu.playListMenu();
                    System.out.println("请输入你的选择结果");
                    int getOne = sc.nextInt();
                    if (getOne == 0) {
                        break;
                    }
                    switch (getOne) {
                        case 1:
                            System.out.println("将歌曲添加到播放列表");
                            System.out.println("请输入要添加的歌曲的数量");
                            int count = sc.nextInt();
                            for (int i = 1; i <= count; i++) {
                                System.out.println("请输入第" + i + "首歌曲");
                                System.out.println("请输入歌曲的id:");
                                String strId = sc.next();
                                System.out.println("请输入歌曲的名称:");
                                String strName = sc.next();
                                System.out.println("请输入演唱者:");
                                String strSinger = sc.next();
                                //创建歌曲类的对象
                                Song song = new Song(strId, strName, strSinger);
                                mainPlayList.addToPlayList(song);
                                mainPlayList.displayAllSong();
                            }
                            break;
                    }
                    break;
                case 2:
                    //播放器管理
                    PlayerMenu.playerMenu();
                    break;
                default:
                    System.out.println("该数字没有对应的操作");
                    break;
            }
        }
    }


}
