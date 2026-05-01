# Write your MySQL query statement below
SELECT user_id, COUNT(user_id) AS followers_count
FROM followers
Group by user_id
order by user_id ASC;