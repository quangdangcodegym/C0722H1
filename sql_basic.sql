select c.ClassName
from class c join student s on c.ClassID = s.ClassId
where s.StudentName like 'D%'
group by c.ClassID
having count(c.ClassName)>2

-- Lấy những lớp mà có học sinh bắt đầu bằng chữ D có số lượng lớn hơn 2