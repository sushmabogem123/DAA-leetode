SELECT MAX(num) num
FROM MyNumbers
WHERE num <> ALL (
    SELECT num
    FROM MyNumbers
    GROUP BY num
    HAVING COUNT(*) > 1
);