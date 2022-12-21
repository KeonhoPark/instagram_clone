package toyProject.instagramClone.feedImg;

import toyProject.instagramClone.feed.Feed;

import javax.persistence.*;

@Entity
public class FeedImg {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long feedImgId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "imgUrlList")
    private Feed feed;

    private String imgUrl;
}
