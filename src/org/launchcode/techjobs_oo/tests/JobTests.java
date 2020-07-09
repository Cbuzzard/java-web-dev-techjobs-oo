package org.launchcode.techjobs_oo.tests;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

import org.launchcode.techjobs_oo.*;

import java.util.Comparator;

public class JobTests {

    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();
        assertFalse(job1.getId() == job2.getId());
    }

    @Test
    public void testFullConstructor() {
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(testJob instanceof Job);
        assertTrue(testJob.getEmployer() instanceof Employer);
        assertTrue(testJob.getLocation() instanceof Location);
        assertTrue(testJob.getPositionType() instanceof PositionType);
        assertTrue(testJob.getCoreCompetency() instanceof CoreCompetency);
        assertEquals(testJob.getEmployer().getValue(), "ACME");
        assertEquals(testJob.getLocation().getValue(), "Desert");
        assertEquals(testJob.getPositionType().getValue(), "Quality control");
        assertEquals(testJob.getCoreCompetency().getValue(), "Persistence");
    }

    @Test
    public void testJobsForEquality() {
        Job testJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job testJob2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(testJob1.equals(testJob2));
    }

    @Test
    public void testJobToString() {
        Job testJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(testJob1.toString(),
                "\nID: " + testJob1.getId() +
                        "\nName: Product tester" +
                        "\nEmployer: ACME" +
                        "\nLocation: Desert" +
                        "\nPosition Type: Quality control" +
                        "\nCore Competency: Persistence\n");
    }

    @Test
    public void testToStringEmptyField() {
        Job testJob1 = new Job("", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(testJob1.toString(),
                "\nID: " + testJob1.getId() +
                        "\nName: Data not available" +
                        "\nEmployer: ACME" +
                        "\nLocation: Desert" +
                        "\nPosition Type: Quality control" +
                        "\nCore Competency: Persistence\n");
    }

}
