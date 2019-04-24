package lambdas.j8functional.chapter3;

import cc.conyli.commons.RandomGenerator;
import lambdas.j8functional.entity.Album;
import lambdas.j8functional.entity.Artist;
import lambdas.j8functional.entity.Prepare;
import lambdas.j8functional.entity.Track;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * a 答案是cc.conyli.commons.Collections.addCollection方法
 * <p>
 * b 艺术家的姓名和国籍，需要搞两个流合并成一个流？
 */


public class Question1 {



    public static void main(String[] args) {

        Question1 question1 = new Question1();

        List<Artist> artists = Prepare.getArtistList(4);

        question1.answerToB(artists);

        List<Album> albums = Prepare.getAlbumList(5);

        question1.answerToC(albums);

    }



    private void answerToB(List<Artist> artists) {
        //用flatmap拆成两个部分，艺术家和国籍，然后把流再合并起来

        System.out.println("传入的参数是：");
        for (Artist artist : artists) {
            System.out.println(artist);
        }

        List<String> stringList = artists.stream().flatMap(x -> Stream.of("艺术家：" + x.getName(), "国籍：" + x.getOrigin())).collect(Collectors.toList());

        System.out.println(stringList);

    }

    private void answerToC(List<Album> albums) {
        //从专辑列表中，找出所有tracks属性的长度不超过3的专辑的列表

        System.out.println("传入的参数是：");
        for (Album albums1 : albums) {
            System.out.println(albums1);
        }

        List<Album> albums1 = albums.stream().filter(list -> list.getTracks().size() <= 3).collect(Collectors.toList());

        System.out.println("过滤后的列表是：");
        for (Album album : albums1) {
            System.out.println(album.getName());
        }

    }




}
