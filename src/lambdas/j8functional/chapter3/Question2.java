package lambdas.j8functional.chapter3;

import lambdas.j8functional.entity.Album;
import lambdas.j8functional.entity.Artist;
import lambdas.j8functional.entity.Prepare;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * a 答案是cc.conyli.commons.Collections.addCollection方法
 * <p>
 * b 艺术家的姓名和国籍，需要搞两个流合并成一个流？
 */


public class Question2 {



    public static void main(String[] args) {

        Question2 question2 = new Question2();

        List<Artist> artists = Prepare.getArtistList(4);


        List<Album> albums = Prepare.getAlbumList(5);

        question2.originQuestion(artists);


    }

    public void originQuestion(List<Artist> artists) {

        System.out.println("传入的参数是：");

        for (Artist artist : artists) {
            System.out.println(artist);
        }

        //这段代码实际上是统计每个Artist中成员的数量，可以修改如下
//        int totalMembers = 0;
//        for (Artist artist : artists) {
//            Stream<Artist> members = artist.getMembers();
//            totalMembers += members.count();
//        }

        //直接先用map转换成int流，再用reduce将流加起来变成一个值
        int totalMembers = artists.stream().map(artist -> artist.getMembers().size()).reduce(0, (x, y) -> x + y);

        System.out.println(totalMembers);
    }






}
