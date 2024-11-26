package com.tx.test;

import com.tx.dao.JobDao;
import com.tx.entities.Job;
import com.tx.helper.SessionFactoryRegistry;

public class TxMgmtTest {
    public static void main(String[] args) {
        Job job = null;
        JobDao jobDao = null;

        try {
            jobDao = new JobDao();

            job = new Job();
            job.setJobNo(2);
            job.setJobTitle("Bank Dev");
            job.setDescription("Enthusiastic Developer. Good Skill he have. " +
                    "Whenever we are in trouble he will help us out");
            job.setDesignation("IC5");
            job.setLocation("HYD");
            job.setSalary(96000.00);

            jobDao.saveJob(job);
        }
        finally {
            SessionFactoryRegistry.closeSF();
        }
    }
}
