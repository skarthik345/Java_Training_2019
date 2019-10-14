Create Table Trainer (
TrainerID Smallint,
TrainerName Varchar(10) Not Null,
EmailID Varchar(10),
Phone Varchar(10),
Primary Key(TrainerID),
Constraint UNIQUE(EmailID)
);

Insert into Trainer values (1, 'Abraham', 't1@i.com','9844499901');
Insert into Trainer values (2, 'Boyce', 't2@i.com','9844499902');
Insert into Trainer values (3, 'Camilla', 't3@i.com','9844499903');
Insert into Trainer values (4, 'Davis', 't4@i.com','9844499904');
Insert into Trainer values (5, 'Elsa', 't5@i.com','9844499905');

Create Table Course_Details (
CourseID varchar(3) PRIMARY KEY,
CourseName Varchar(30) Not Null
);

Insert into Course_Details values('GPF', 'Programming Fundamentals');
Insert into Course_Details values('GDB', 'Rel Database Manage System');
Insert into Course_Details values('ODB', 'Oracle 9i');
Insert into Course_Details values('OVB', 'Visual Basic');
Insert into Course_Details values('JJA', 'Java');
Insert into Course_Details values('JJE', 'Java JEE1');

Create Table Batch_Schedule (
BatchName Varchar(8),
CourseID Char(3),
Start_date Date Not Null,
End_Date Date Not Null,
Constraint pk_BS Primary Key (BatchName,CourseID),
Constraint fk_BS_CID Foreign key (CourseID) References Course_Details(CourseID)
);

Insert into Batch_Schedule values ('Batch1', 'GPF', '2008-01-10','2008-01-20');
Insert into Batch_Schedule values ('Batch1', 'GDB', '2008-01-21','2008-01-31');
Insert into Batch_Schedule values ('Batch1', 'ODB', '2008-02-01','2008-02-20');
Insert into Batch_Schedule values ('Batch1', 'OVB', '2008-02-21','2008-02-28');
Insert into Batch_Schedule values ('Batch2', 'GPF', '2008-01-10','2008-01-20');
Insert into Batch_Schedule values ('Batch3', 'GPF', '2008-01-21','2008-02-01');
Insert into Batch_Schedule values ('Batch3', 'JJA', '2008-02-02','2008-02-08');

Create Table Feedback(
TrainerID Tinyint References Trainer(TrainerID),
CourseID Char(3),
BatchName Varchar(8) ,
FBRate Decimal(3,2) Not Null,
Constraint ck_FB_FBRate Check (FBRate>0 and FBRate<=5),
Constraint fk_FB_CID_BN Foreign Key (BatchName, CourseID) References Batch_Schedule(BatchName,CourseID),
Constraint pk_FB Primary Key (TrainerID,CourseID,BatchName)
);

Insert into Feedback values (1, 'GPF','Batch1',4.18);
Insert into Feedback values (2, 'GDB','Batch1',4.65);
Insert into Feedback values (3, 'ODB','Batch1',4.51);
Insert into Feedback values (4, 'OVB','Batch1',4.68);
Insert into Feedback values (5, 'GPF','Batch2',4.28);
Insert into Feedback values (1, 'GPF','Batch3',4.28);
Insert into Feedback values (3, 'JJA','Batch3',4.32);

select distinct t.trainername, c.coursename
    from trainer t, feedback f, course_details c
    where t.trainerid=f.trainerid 
        and f.courseid=c.courseid

select t.trainername, count(CourseName)
    from trainer t, feedback f, course_details c
    where t.trainerid=f.trainerid 
        and f.courseid=c.courseid
    group by t.TrainerName
    having count(coursename)>1

select TrainerID, trainername, count(CourseName)
    from (select distinct t.trainerid, t.trainername, c.coursename
            from trainer t, feedback f, course_details c
            where t.trainerid=f.trainerid 
                and f.courseid=c.courseid
            group by t.trainerid,t.TrainerName, c.coursename) as final
    group by trainerid,trainername 

select TrainerID, trainername, coursename, count(CourseName)
    from (select t.trainerid, t.trainername, c.coursename, f.BatchName
            from trainer t, feedback f, course_details c
            where t.trainerid=f.trainerid 
                and f.courseid=c.courseid
            group by t.trainerid,t.TrainerName, c.coursename, f.batchname) as final
    group by trainerid,trainername,coursename

select distinct bs.batchname, DATEDIFF(maxi.max,mini.min) as Duration_of_batch
    from Batch_Schedule as bs, (select batchname,min(start_date) as min from Batch_Schedule
        group by batchname) as mini,
        (select batchname,max(end_date) as max from Batch_Schedule
        group by batchname) as maxi
    where bs.batchname=mini.batchname
        and bs.batchname=maxi.batchname                

select t.trainername, c.coursename, bs.batchname
    from trainer t, feedback f, course_details c, Batch_Schedule bs
    where t.trainerid=f.trainerid 
        and f.courseid=c.courseid
        and c.courseid=bs.courseid
        and f.batchname=bs.batchname
        and bs.start_date<'2008-02-20'

select t.trainerid
    from trainer t, feedback f, course_details c, Batch_Schedule bs
    where t.trainerid=f.trainerid 
        and f.courseid=c.courseid
        and c.courseid=bs.courseid
        and f.batchname=bs.batchname
        
select TrainerID, trainername, coursename, count(CourseName)
    from (select t.trainerid, t.trainername, c.coursename, f.BatchName
            from trainer t, feedback f, course_details c
            where t.trainerid=f.trainerid 
                and f.courseid=c.courseid
            group by t.trainerid,t.TrainerName, c.coursename, f.batchname) as final
    group by trainerid,trainername,coursename
