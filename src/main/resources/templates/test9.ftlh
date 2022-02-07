<#import "parts/common.ftlh" as c>

<@c.page>
    <h3>Таблица 9</h3>
    <div class="container my-3">
        <div class="row">
            <table class="table shadow ">
                <thead class="thead-dark">
                <tr>
                    <th>ID</th>
                    <th>Масштаб</th>
                    <th>Категория сложности</th>
                    <th>Высота сечения</th>
                    <th>Незастроенная полевые</th>
                    <th>Незастроенная камерал.</th>
                    <th>Застроенная полевые</th>
                    <th>Застроенная камерал.</th>
                    <th>Действующие пром. пред. полевые</th>
                    <th>Действующие пром. пред. камерал</th>
                </tr>
                </thead>
                <#list all as task>
                    <tbody>
                    <tr>
                        <td>${task.id}</td>
                        <td>${task.SCALE}</td>
                        <td>${task.CATEGORY}</td>
                        <td>${task.SECTION_HEIGHT}</td>
                        <td>${task.TYPE_UNBUILT_FIELD}</td>
                        <td>${task.TYPE_UNBUILT_CAMERAL}</td>
                        <td>${task.TYPE_BUILT_FIELD}</td>
                        <td>${task.TYPE_BUILT_CAMERAL}</td>
                        <td>${task.TYPE_INDUSTRIAL_FIELD}</td>
                        <td>${task.TYPE_INDUSTRIAL_CAMERAL}</td>
                    </tr>
                    </tbody>
                </#list>
            </table>
        </div>

    </div>
    <#include "parts/messageList.ftlh" />
</@c.page>