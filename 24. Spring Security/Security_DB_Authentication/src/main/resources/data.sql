INSERT INTO `users` (`username`, `password`, `full_name`, `role`, `country`, `enabled`) VALUES
	('rose', '$2a$10$yDI73dqR2IytBnwENAOSr.sdPpvRRMDkOlCpH.ACxxE/GkaT7KJUK', 'Roshini Kishore', 'ROLE_ADMIN', 'DUBAI', 1),
	('kishore', '$2a$10$u1dTkpr6T6wd97.y3fzD..2yiPyCNe0cl2nO3W5MKvt2NyYImBrre', 'Kishore Arumugam', 'ROLE_USER', 'India', 1); 

   INSERT INTO `topics` (`topic_id`, `title`, `category`) VALUES
	(1, 'Spring Rest Boot', 'Spring Boot'),
	(2, 'Spring Boot Security', 'Spring Boot'),
	(3, 'Spring MVC Framework', 'Spring Framework');