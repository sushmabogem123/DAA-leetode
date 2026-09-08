select Max(num) as num
From MyNumbers
Where num in (
    Select num
    From MyNumbers
    Group by num
    having count(*) = 1
)