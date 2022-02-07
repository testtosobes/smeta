<#import "parts/common.ftlh" as c>

<@c.page>
    <h3>Таблица 4</h3>
    <div class="container my-3">
        <div class="row">
            <table class="table shadow ">
                <thead class="thead-dark">
                <tr>
                    <th>ID</th>
                    <th>Расстояние</th>
                    <th>до 75</th>
                    <th>75 - 100</th>
                    <th>150 - 300</th>
                    <th>300 - 750</th>
                    <th>свыше 750</th>

                </tr>
                </thead>
                <#list all as task>
                    <tbody>
                    <tr>
                        <td>${task.id}</td>
                        <td>${task.INTER_DISTANCE}</td>
                        <td>${task.COSTS_TO_75}</td>
                        <td>${task.COSTS_75_150}</td>
                        <td>${task.COSTS_150_300}</td>
                        <td>${task.COSTS_300_750}</td>
                        <td>${task.COSTS_700}</td>
                    </tr>
                    </tbody>
                </#list>
            </table>
        </div>

    </div>
    <#include "parts/messageList.ftlh" />
</@c.page>