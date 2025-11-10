# AI Email Writer

A Spring Boot application that generates emails using AI (Gemini API).

## Features

- Generate personalized emails using AI
- RESTful API endpoints
- Spring Boot with WebFlux for reactive programming
- Environment-based configuration

## Prerequisites

Before running this application, make sure you have:

- Java 21 or higher
- Maven 3.6 or higher
- Gemini API key from Google AI Studio

## Setup Instructions

1. **Clone the repository**
   ```bash
   git clone https://github.com/athakre1962000/ai-email-writer-java.git
   cd ai-email-writer-java
   ```

2. **Set up environment variables**
   
   Create a `.env` file in the project root directory with the following content:
   ```
   GEMINI_API_URL=https://generativelanguage.googleapis.com/v1beta/models/gemini-pro:generateContent
   GEMINI_API_KEY=your_gemini_api_key_here
   SERVER_PORT=8080
   ```

   **Important:** Replace `your_gemini_api_key_here` with your actual Gemini API key.

3. **Install dependencies**
   ```bash
   mvn clean install
   ```

4. **Run the application**
   ```bash
   mvn spring-boot:run
   ```

   The application will start on `http://localhost:8080` (or the port specified in your .env file).

## API Endpoints

### Generate Email
- **URL:** `POST /api/emails/generate`
- **Content-Type:** `application/json`
- **Request Body:**
  ```json
  {
    "prompt": "Write a professional email to...",
    "context": "Additional context for email generation"
  }
  ```

## Project Structure

```
src/
├── main/
│   ├── java/com/email/writer/
│   │   ├── EmailWriterApplication.java      # Main application class
│   │   ├── EmailGeneratorController.java    # REST controller
│   │   ├── EmailGeneratorService.java       # Business logic service
│   │   ├── EmailRequest.java                # Request DTO
│   │   ├── EnvironmentConfig.java           # Environment configuration
│   │   └── WebClientConfig.java             # WebClient configuration
│   └── resources/
│       └── application.properties           # Application configuration
└── test/
    └── java/com/email/writer/
        └── EmailWriterApplicationTests.java # Test classes
```

## Getting Your Gemini API Key

1. Go to [Google AI Studio](https://makersuite.google.com/app/apikey)
2. Sign in with your Google account
3. Create a new API key
4. Copy the API key and add it to your `.env` file

## Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## License

This project is licensed under the MIT License.

## Support

If you encounter any issues or have questions, please open an issue on GitHub.