# Drone based transportation



## Overview

The Drone Fleet Management System is a Spring Boot-based RESTful service designed to manage a fleet of drones for various operations, with a focus on food delivery services. The system allows for the tracking and management of drones, including their status and operational capabilities.me)!

## Features

    Drone Management: Manage a fleet of drones with functionalities to add, update, delete, and view all drones.
    Flight Management: (If implemented) Handle flight plans for drones including scheduling, tracking, and historical data management.
    In-memory Data Storage: Temporary storage of drone data in memory for quick access and demonstration purposes.


## REST API Endpoints

    GET /dronora/drones: Retrieve a list of all drones.
    POST /dronora/drones: Add a new drone to the fleet.
    PUT /dronora/drones/{id}: Update the details of a specific drone.
    DELETE /dronora/drones/{id}: Remove a drone from the fleet.

## Testing

Example curl command to fetch all drones:
curl -X GET http://localhost:8080/dronora/drones

## Running the Application

Run FleetApplication.java as a Java application.
The service will start on localhost with the default port 8tml)


