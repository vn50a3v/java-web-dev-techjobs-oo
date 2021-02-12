package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;
import org.launchcode.techjobs_oo.Job;

import static org.junit.Assert.*;

public class JobTest {

    @Test
    public void testSettingJobId (){
        Job j1 = new Job();
        Job j2 = new Job();
        assertEquals(j1.getId(), j2.getId() - 1);
    }
    @Test
    public void testJobConstructorSetsAllFields () {
        Job jobSet = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"),
                new CoreCompetency("Persistence"));

        assertTrue(jobSet.getName() instanceof String);
        assertEquals("Product tester", jobSet.getName());

        assertTrue(jobSet.getEmployer() instanceof Employer);
        assertEquals("ACME", jobSet.getEmployer().getValue());

        assertTrue(jobSet.getLocation() instanceof Location);
        assertEquals("Desert", jobSet.getLocation().getValue());

        assertTrue(jobSet.getPositionType() instanceof PositionType);
        assertEquals("Quality control", jobSet.getPositionType().getValue());

        assertTrue(jobSet.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Persistence", jobSet.getCoreCompetency().getValue());

    }

    @Test
    public void testJobsForEquality (){
        Job j1 = new Job();
        Job j2 = new Job();
        assertNotEquals(j1,j2); //Should pass
         }
    @Test
    public void testIfStartAndEndsWithBlankLine(){
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String myJob = job.toString();
        assertTrue(myJob.startsWith("\n"));
        assertTrue(myJob.endsWith("\n"));
    }

    @Test
    public void testIfSecondBlankLineIsSet(){
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String myJob = job.toString();
        String[] jobArrString = myJob.split("\n");
        assertEquals("ID: " + job.getId(), jobArrString[1]);

    }
    @Test
    public void testIfThirdBlankLineIsSet(){
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String myJob = job.toString();
        String[] jobArr = myJob.split("\n");
        assertEquals("Name: " + job.getName(), jobArr[2]);
       }
    @Test
    public void testIfForthBlankLineIsSet(){
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String myJob = job.toString();
        String[] jobArr = myJob.split("\n");
        assertEquals("Employer: " + job.getEmployer(), jobArr[3]);
    }
    @Test
    public void testIfFirthBlankLineIsSet(){
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String myJob = job.toString();
        String[] jobArr = myJob.split("\n");
        assertEquals("Location: " + job.getLocation(), jobArr[4]);

    }

    @Test
    public void testIfSixthBlankLineIsSet(){
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String myJob = job.toString();
        String[] jobArr = myJob.split("\n");
        assertEquals("Position Type: " + job.getPositionType(), jobArr[5]);


    }

    @Test
    public void testIfSeventhBlankLineIsSet(){
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String myJob = job.toString();
        String[] jobArrString = myJob.split("\n");
        assertEquals("Core Competency: " + job.getCoreCompetency(), jobArrString[6]);

    }
    @Test
    public void testIfNoValuePassed(){
        Job job = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
        String jobString = job.toString();
        String[] jobStringArr = jobString.split("\n");

        assertEquals("Name: Data not available", jobStringArr[2]);
        assertEquals("Employer: Data not available", jobStringArr[3]);
        assertEquals("Location: Data not available", jobStringArr[4]);
        assertEquals("Position Type: Data not available", jobStringArr[5]);
        assertEquals("Core Competency: Data not available", jobStringArr[6]);

       }
       @Test
       public void testIdOnlyID(){
           Job job = new Job();
           System.out.println(job.getId());
           assertEquals("OOPS! This job does not seem to exist.", job.toString());

       }
    }
