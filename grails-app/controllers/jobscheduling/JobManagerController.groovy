package jobscheduling

import org.quartz.CronScheduleBuilder
import org.quartz.JobDetail
import org.quartz.Scheduler
import org.quartz.SchedulerFactory
import org.quartz.SimpleScheduleBuilder
import org.quartz.Trigger
import org.quartz.TriggerBuilder

class JobManagerController {


    def index(){

    }
    def start() {
        Trigger trigger = TriggerBuilder
                .newTrigger()
                .withIdentity("Ivanildo","grupo1")
                .startNow()
                .withSchedule(
                SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(1).repeatForever())
                .forJob("Ivanildo","grupo1").usingJobData("param1","FINALMENTE").
                build();

        BuscaCotacaoJob.schedule(trigger)



        render(view:"index")
    }
    def novoJob(){

        Trigger trigger = TriggerBuilder
                .newTrigger()
                .withIdentity("Susiane","group1")
                .startNow()
                .withSchedule(
                SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(1).repeatForever())
                .usingJobData("param1","....").
                build();

        BuscaCotacaoJob.schedule(trigger)



        render(view:"index")
    }
    def stop(){
        println BuscaCotacaoJob.findAll()
        BuscaCotacaoJob.unschedule("Ivanildo","grupo1")
        render(view:"index")

    }
}
