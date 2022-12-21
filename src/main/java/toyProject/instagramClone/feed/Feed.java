package toyProject.instagramClone.feed;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import toyProject.instagramClone.feedImg.FeedImg;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Feed {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long feedId;

    @OneToMany
    @JoinColumn(name = "feed")
    private List<FeedImg> imgUrlList;

    @Lob
    private String description;


    private Enum status;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;

}
