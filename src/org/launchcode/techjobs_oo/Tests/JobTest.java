package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;
import org.launchcode.techjobs_oo.Job;

import java.net.PortUnreachableException;

import static org.junit.Assert.*;

public class JobTest {

    @Test
    public void testSettingJobId (){
        Job j1 = new Job();
        Job j2 = new Job();
        assertEquals(j2.getId(), j1.getId() + 1);
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
    }
