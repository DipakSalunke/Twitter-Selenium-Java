# -*- coding: utf-8 -*-
"""
Created on Thu Oct 17 00:13:50 2019

@author: dipak
"""

from selenium import webdriver
from getpass import getpass

def login_twitter(username, password):
    driver = webdriver.Chrome("F:\LP II\Selenium\chromedriver.exe")
    driver.get("https://twitter.com/login")

    username_field = driver.find_element_by_class_name("js-username-field")
    password_field = driver.find_element_by_class_name("js-password-field")

    username_field.send_keys(username)
    driver.implicitly_wait(1)
    
    password_field.send_keys(password)
    driver.implicitly_wait(1)

    driver.find_element_by_class_name("EdgeButtom--medium").click()

    driver.implicitly_wait(10)
if __name__ == "__main__":
    username = input("user name : ")
    password = getpass("password  : ")
    login_twitter(username, password)
