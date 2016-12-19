package jobscheduling

import org.quartz.Job
import org.quartz.JobDataMap
import org.quartz.JobExecutionContext
import org.quartz.JobExecutionException
import org.quartz.Trigger
import org.springframework.scheduling.TriggerContext

class BuscaCotacaoJob implements Job{
//    static triggers = {
//      simple repeatInterval: 5000l // execute job once in 5 seconds
//    }

    void execute(JobExecutionContext context) throws JobExecutionException{

        JobDataMap map = context.trigger.getJobDataMap()
        def jobKey = context.trigger.getJobKey().toString()
        def param1 = map.get("param1")
        println "Job Name: ${jobKey} - Parametro:  ${param1}"
    }


}
