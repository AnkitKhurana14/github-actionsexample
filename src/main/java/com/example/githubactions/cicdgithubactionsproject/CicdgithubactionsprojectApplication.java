package com.example.githubactions.cicdgithubactionsproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CicdgithubactionsprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(CicdgithubactionsprojectApplication.class, args);
	}

}
//echo "# github-actionsexample" >> README.md
//git init
//git add README.md
//git commit -m "first commit"
//git branch -M main
//git remote add origin https://github.com/AnkitKhurana14/github-actionsexample.git
//git push -u origin main