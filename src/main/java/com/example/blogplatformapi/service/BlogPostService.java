package src.main.java.com.example.blogplatformapi.service;

import src.main.java.com.example.blogplatformapi.model.BlogPost;

public class BlogPostService {
    private final BlogPostRepository blogPostRepository;

    @Autowired
    public BlogPostService(BlogPostRepository blogPostRepository) {
        this.blogPostRepository = blogPostRepository;
    }

    public List<BlogPost> getAllBlogPosts() {
        return blogPostRepository.findAll();
    }

    public Optional<BlogPost> getBlogPostById(Long id) {
        return blogPostRepository.findById(id);
    }
    public BlogPost createBlogPost(BlogPost blogPost) {
        return blogPostRepository.save(blogPost);
    }

    public BlogPost updateBlogPost(Long id, BlogPost updatedBlogPost) {
        BlogPost existingBlogPost = blogPostRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid BlogPost ID: " + id));

        existingBlogPost.setTitle(updatedBlogPost.getTitle());
        existingBlogPost.setContent(updatedBlogPost.getContent());
        existingBlogPost.setAuthor(updatedBlogPost.getAuthor());

        return blogPostRepository.save(existingBlogPost);
    }
    public void deleteBlogPost(Long id) {
        blogPostRepository.deleteById(id);
    }
}
