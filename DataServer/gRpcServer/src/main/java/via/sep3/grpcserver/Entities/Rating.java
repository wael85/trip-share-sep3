package via.sep3.grpcserver.Entities;

import javax.persistence.*;

@Entity
@Table(name = "rating", schema = "trip_share")
@NamedQueries({
        @NamedQuery(name = "Rating.findByWriter", query = "select r from Rating r where r.writer.email = :email"),
        @NamedQuery(name = "Rating.findBySubject", query = "select r from Rating r where r.subject.email = :email")
})
public class Rating {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "writer_email")
    private User writer;
    @ManyToOne
    @JoinColumn(name = "subject_email")
    private User subject;
    @Column(nullable = false)
    private int rating;
    @Column(nullable = false)
    private String comment;

    public Long getId() {
        return id;
    }

    public User getWriter() {
        return writer;
    }

    public void setWriter(User writer) {
        this.writer = writer;
    }

    public User getSubject() {
        return subject;
    }

    public void setSubject(User subject) {
        this.subject = subject;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
