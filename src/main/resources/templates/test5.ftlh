<#import "parts/common.ftlh" as c>

<@c.page>
    <h3>Таблица 5</h3>
    <div class="container my-3">
        <div class="row">
            <table class="table shadow ">
                <thead class="thead-dark">
                <tr>
                    <th>ID</th>
                    <th>Расстояние</th>
                    <th>до 1</th>
                    <th>2</th>
                    <th>3</th>
                    <th>6</th>
                    <th>9</th>
                    <th>12 и более</th>

                </tr>
                </thead>
                <#list all as task>
                    <tbody>
                    <tr>
                        <td>${task.id}</td>
                        <td>${task.EXTER_DISTANCE}</td>
                        <td>${task.COSTS_TO_1}</td>
                        <td>${task.COSTS_2}</td>
                        <td>${task.COSTS_3}</td>
                        <td>${task.COSTS_6}</td>
                        <td>${task.COSTS_9}</td>
                        <td>${task.COSTS_12}</td>
                    </tr>
                    </tbody>
                </#list>
            </table>
        </div>

    </div>
    <#include "parts/messageList.ftlh" />
</@c.page>