//
//  FirstViewController.swift
//  List
//
//  Created by Jiho Choi on 2017. 3. 12..
//  Copyright © 2017년 iosteam. All rights reserved.
//

import UIKit

class FirstViewController: UIViewController, UITableViewDelegate, UITableViewDataSource {

    
    @IBOutlet var tblTasks: UITableView!
    
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }

    // Returning to view
    override func viewWillAppear(_ animated: Bool) {
        tblTasks.reloadData();
        
    }
    
    // UITableViewDelete
    func tableView(_ tableView: UITableView, commit editingStyle: UITableViewCellEditingStyle, forRowAt indexPath: IndexPath) {
        if (editingStyle == UITableViewCellEditingStyle.delete) {
            taskMgr.tasks.remove(at: indexPath.row)
            tblTasks.reloadData();
        }
    }
    
    
    // UITableViewDataSource
    public func tableView(_ tableView: UITableView, numberOfRowsInSection section: Int) -> Int {
        return taskMgr.tasks.count
    }
    
    public func tableView(_ tableView: UITableView, cellForRowAt indexPath: IndexPath) -> UITableViewCell {
        
        let cell: UITableViewCell = UITableViewCell(style: UITableViewCellStyle.subtitle, reuseIdentifier: "test")
    
        cell.textLabel?.text = taskMgr.tasks[indexPath.row].name
        cell.detailTextLabel?.text = taskMgr.tasks[indexPath.row].desc
        
        return cell
    }
    
    

}

