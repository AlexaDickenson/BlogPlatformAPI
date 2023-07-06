# Blog Platform RESTful API

This is a simple blog platform RESTful API developed using Spring Boot.

## Running the Project

To run the project, follow these steps:

1. Ensure you have Java and Maven installed on your system.
2. Clone the project repository.
3. Open a terminal and navigate to the project directory.
4. Run the command: `mvn spring-boot:run`
5. The application will start running on `http://localhost:8080`.

## Testing the Project

To test the project, you can use a tool like cURL, Postman, or any other HTTP client.

### Endpoints

The API provides the following endpoints:

1. GET /posts
   - Description: Retrieves all blog posts.
   - Example: `GET http://localhost:8080/posts`
   - Response: 200 OK
     ```
     [
         {
             "id": 1,
             "title": "First Post",
             "content": "This is my first blog post.",
             "author": "John Doe"
         },
         {
             "id": 2,
             "title": "Second Post",
             "content": "This is my second blog post.",
             "author": "Jane Smith"
         }
     ]
     ```

2. GET /posts/{id}
   - Description: Retrieves a specific blog post by its ID.
   - Example: `GET http://localhost:8080/posts/1`
   - Response: 200 OK
     ```
     {
         "id": 1,
         "title": "First Post",
         "content": "This is my first blog post.",
         "author": "John Doe"
     }
     ```

3. POST /posts
   - Description: Creates a new blog post.
   - Example: `POST http://localhost:8080/posts`
     ```
     {
         "title": "New Post",
         "content": "This is a new blog post.",
         "author": "Alice Johnson"
     }
     ```
   - Response: 201 Created
     ```
     {
         "id": 3,
         "title": "New Post",
         "content": "This is a new blog post.",
         "author": "Alice Johnson"
     }
     ```

4. PUT /posts/{id}
   - Description: Updates an existing blog post by its ID.
   - Example: `PUT http://localhost:8080/posts/2`
     ```
     {
         "title": "Updated Post",
         "content": "This is an updated blog post.",
         "author": "Jane Smith"
     }
     ```
   - Response: 200 OK
     ```
     {
         "id": 2,
         "title": "Updated Post",
         "content": "This is an updated blog post.",
         "author": "Jane Smith"
     }
     ```

5. DELETE /posts/{id}
   - Description: Deletes a blog post by its ID.
   - Example: `DELETE http://localhost:8080/posts/1`
   - Response: 204 No Content

