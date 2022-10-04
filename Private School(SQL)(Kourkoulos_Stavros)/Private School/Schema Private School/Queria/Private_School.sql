-- List of All Students
select St_ID,student.St_FName,student.St_LName
from student;

-- List of All Trainers
select trainer.Tr_ID,trainer.Tr_FName,trainer.Tr_LName
from trainer;

-- List of All Courses
select *
from course;

-- List of All Assignments
select *
from assignment;

-- Student per Course:
select course.Title as 'Τίτλος Μαθήματος',course.C_ID,student.St_FName,student.St_LName
from student
join st_course on student.St_ID=st_course.St_Course
join course on st_course.C_All_St=course.C_ID;

-- Trainer per Course:
select course.Title as 'Τίτλος Mαθήματος',trainer.Tr_ID,trainer.Tr_FName,trainer.Tr_LName
from trainer
join tr_course on trainer.Tr_ID=tr_course.Tr_Involved
join course on tr_course.Course_All_Tr=course.C_ID;


-- All Assignments per Course:
 select course.Title,assignment.Title,assignment.Description
 from assignment
 join c_ass on Ass_All_C=assignment.Ass_ID
 join course on course.C_ID=C_ass.C_Ass_Involded;

-- All Assignemnts per Course per Student:
select course.Title,assignment.Title,student.St_FName,student.St_LName
 from assignment
 join c_ass on Ass_All_C=assignment.Ass_ID
 join course on course.C_ID=c_ass.C_Ass_Involded
 join st_ass on c_ass.Ass_All_C=st_ass.Ass_All_St
 join student on st_ass.St_Involved_Ass=student.St_ID;
 
 
 -- All students that belong to more than one courses:
 select *
 from student
 join st_course on student.St_ID=st_course.St_Course
 where student.St_ID>1;
 
 
 
 
 
 
 
 
 
 
 
