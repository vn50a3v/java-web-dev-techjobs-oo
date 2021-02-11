package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;
import org.launchcode.techjobs_oo.Job;

import java.net.PortUnreachableException;

import static org.junit.Assert.*;

public class JobTest {
    JobField job1;
    Job job2;
    Job jobSet;

    @Before
    public void Job () {
        job1 = new JobField(1);

        Job jobSet = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"),
                new CoreCompetency("Persistence"));

    }

    @Test
    public void testSettingJobId (){
        assertEquals(1,job1.getId(),.001);
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
        Job job1 = new Job();
        Job job2 = new Job();
        assertEquals(job1, job2); //Should return False

      }
    }
