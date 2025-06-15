# Spring Boot JWT Authentication with Email Verification

This project implements a full authentication flow using **Spring Boot, Spring Security, JWT and Email Verification (Gmail SMTP)**.

## Architecture
![Spring Security Project Schema](https://github.com/user-attachments/assets/c7fbf950-a82f-4f51-9969-33534a0257fd)

## Features

- User registration with email verification
- Login with JWT token generation
- Stateless authentication via JWT
- Google Mail SMTP integration for verification emails
- Secure password hashing (BCrypt)
- Custom security configuration with authentication filters
- H2 in-memory DB (can be easily switched to SQL/NoSQL)

## Flow Overview

1. User signs up → verification code generated & emailed
2. User verifies account via verification link or code
3. User logs in → receives JWT token
4. All secured endpoints require valid JWT token
5. JWT token handled via custom JWT filter in security chain

## Tech Stack

- Spring Boot 3
- Spring Security
- Spring Data JPA
- JWT (`io.jsonwebtoken`)
- Gmail SMTP (Google App Password)
- Lombok
- H2 Database

## Endpoints

- `POST /auth/signup` — Register new user
- `POST /auth/verify` — Verify user email
- `POST /auth/login` — Login & receive JWT
- `GET /me` — Get authenticated user (JWT protected)
- `POST /auth/resend-verification` — Resend verification email
